package org.telegram.ui.Cells;

import org.telegram.messenger.o10;
public final class r7 {
    public int f30280a;
    public int f30281b;
    public int[] f30282c = null;
    public int d = 1;
    public o10 f30283e;

    public final int a() {
        int[] iArr = this.f30282c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f30281b;
    }

    public final int b() {
        int[] iArr = this.f30282c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f30280a;
    }
}
