package org.telegram.ui.Wallet;
public abstract class ba {
    public static org.telegram.messenger.q5 f42279a;
    public static final int[] f42280b = new int[129];

    static {
        int i7 = 0;
        while (true) {
            int[] iArr = f42280b;
            if (i7 < iArr.length) {
                iArr[i7] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i7))) * 255.0d);
                i7++;
            } else {
                return;
            }
        }
    }
}
