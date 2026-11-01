package org.telegram.ui.Wallet;
public abstract class ga {
    public static org.telegram.messenger.s5 f34610a;
    public static final int[] f34611b = new int[129];

    static {
        int i10 = 0;
        while (true) {
            int[] iArr = f34611b;
            if (i10 < iArr.length) {
                iArr[i10] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i10))) * 255.0d);
                i10++;
            } else {
                return;
            }
        }
    }
}
