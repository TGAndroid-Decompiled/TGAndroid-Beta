package org.telegram.ui.Wallet;

import org.telegram.messenger.DispatchQueue;
public abstract class w9 {
    public static DispatchQueue f37449a;
    public static final int[] f37450b = new int[129];

    static {
        int i10 = 0;
        while (true) {
            int[] iArr = f37450b;
            if (i10 < iArr.length) {
                iArr[i10] = (int) (Math.max(0.0d, Math.min(1.0d, 7.5d - Math.sqrt(i10))) * 255.0d);
                i10++;
            } else {
                return;
            }
        }
    }
}
