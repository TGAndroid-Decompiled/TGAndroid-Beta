package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class z7 {
    public int f21678a;
    public int f21679b;
    public int[] f21680c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f21680c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f21679b;
    }

    public final int b() {
        int[] iArr = this.f21680c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f21678a;
    }
}
