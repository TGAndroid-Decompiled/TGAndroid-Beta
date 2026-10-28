package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class b8 {
    public int f23907a;
    public int f23908b;
    public int[] f23909c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f23909c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23908b;
    }

    public final int b() {
        int[] iArr = this.f23909c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23907a;
    }
}
