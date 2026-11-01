package org.telegram.ui.Cells;

import org.telegram.messenger.l20;
public final class w7 {
    public int f23407a;
    public int f23408b;
    public int[] f23409c = null;
    public int d = 1;
    public l20 e;

    public final int a() {
        int[] iArr = this.f23409c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23408b;
    }

    public final int b() {
        int[] iArr = this.f23409c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23407a;
    }
}
