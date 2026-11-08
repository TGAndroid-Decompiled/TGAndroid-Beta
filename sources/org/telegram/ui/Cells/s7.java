package org.telegram.ui.Cells;

import org.telegram.messenger.w10;
public final class s7 {
    public int f30278a;
    public int f30279b;
    public int[] f30280c = null;
    public int d = 1;
    public w10 f30281e;

    public final int a() {
        int[] iArr = this.f30280c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f30279b;
    }

    public final int b() {
        int[] iArr = this.f30280c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f30278a;
    }
}
