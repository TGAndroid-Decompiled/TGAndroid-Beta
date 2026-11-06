package org.telegram.ui.Cells;

import org.telegram.messenger.w10;
public final class s7 {
    public int f30274a;
    public int f30275b;
    public int[] f30276c = null;
    public int d = 1;
    public w10 f30277e;

    public final int a() {
        int[] iArr = this.f30276c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f30275b;
    }

    public final int b() {
        int[] iArr = this.f30276c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f30274a;
    }
}
