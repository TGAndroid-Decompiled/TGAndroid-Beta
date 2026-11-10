package org.telegram.ui.Cells;

import org.telegram.messenger.w10;
public final class s7 {
    public int f30293a;
    public int f30294b;
    public int[] f30295c = null;
    public int d = 1;
    public w10 f30296e;

    public final int a() {
        int[] iArr = this.f30295c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f30294b;
    }

    public final int b() {
        int[] iArr = this.f30295c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f30293a;
    }
}
