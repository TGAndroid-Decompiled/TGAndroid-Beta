package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class w7 {
    public int f24367a;
    public int f24368b;
    public int[] f24369c = null;
    public int d = 1;
    public Utilities.Callback2Return f24370e;

    public final int a() {
        int[] iArr = this.f24369c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f24368b;
    }

    public final int b() {
        int[] iArr = this.f24369c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f24367a;
    }
}
