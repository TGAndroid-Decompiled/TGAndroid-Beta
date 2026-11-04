package org.telegram.ui.Wallet;
public abstract class ba {
    public static org.telegram.messenger.q5 f42351a;
    public static final int[] f42352b = new int[129];

    static {
        int i3 = 0;
        while (true) {
            int[] iArr = f42352b;
            if (i3 < iArr.length) {
                iArr[i3] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i3))) * 255.0d);
                i3++;
            } else {
                return;
            }
        }
    }
}
