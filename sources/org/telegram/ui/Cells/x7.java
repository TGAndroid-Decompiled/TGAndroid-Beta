package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class x7 {
    public int f23954a;
    public int f23955b;
    public int[] f23956c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f23956c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23955b;
    }

    public final int b() {
        int[] iArr = this.f23956c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23954a;
    }
}
