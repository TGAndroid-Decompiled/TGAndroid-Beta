package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class z7 {
    public int f21921a;
    public int f21922b;
    public int[] f21923c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f21923c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f21922b;
    }

    public final int b() {
        int[] iArr = this.f21923c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f21921a;
    }
}
