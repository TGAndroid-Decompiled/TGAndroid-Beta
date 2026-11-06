package org.telegram.ui.Cells;

import org.telegram.messenger.w10;
public final class s7 {
    public int f30273a;
    public int f30274b;
    public int[] f30275c = null;
    public int d = 1;
    public w10 f30276e;

    public final int a() {
        int[] iArr = this.f30275c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f30274b;
    }

    public final int b() {
        int[] iArr = this.f30275c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f30273a;
    }
}
