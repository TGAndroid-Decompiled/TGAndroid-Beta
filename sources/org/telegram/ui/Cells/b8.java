package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class b8 {
    public int f23906a;
    public int f23907b;
    public int[] f23908c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f23908c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23907b;
    }

    public final int b() {
        int[] iArr = this.f23908c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23906a;
    }
}
