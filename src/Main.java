public class Main {
    // Verilmis ededler siyahisindaki reqemlerinin cemi tek olan ededlerin ededi oratsini tapan alqoritm
    public static void main(String[] args) {
        int[] numbers = {106, 98, 94, 2, 18, 13, 88, 4, 46, 110};
        int sum = 0;
        int value = 0;
        int TotalSum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            value = numbers[1];
            while (value > 0) {
                int lastNumber = value % 10;
                sum += lastNumber;
                value /= 10;
            }
            if (sum % 2 != 0) {
                TotalSum += numbers[i];
                count++;

            }}
        System.out.println(TotalSum / count);
    }}
