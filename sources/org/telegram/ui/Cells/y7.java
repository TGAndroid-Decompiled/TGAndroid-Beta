package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23779a;
    public int f23780b;
    public int[] f23781c = null;
    public int d = 1;
    public Utilities.Callback2Return f23782e;

    public final int a() {
        int[] iArr = this.f23781c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23780b;
    }

    public final int b() {
        int[] iArr = this.f23781c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23779a;
    }
}
