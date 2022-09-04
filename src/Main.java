import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int x = input.nextInt();
        int sonuc = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sonuc += i;
            }
        }
        if (sonuc == x) {
            System.out.println("Girdiğiniz sayı mükemmel sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir.");
        }
    }
}