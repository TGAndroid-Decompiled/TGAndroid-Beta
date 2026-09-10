package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class z7 {
    public int f20790a;
    public int f20791b;
    public int[] f20792c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f20792c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f20791b;
    }

    public final int b() {
        int[] iArr = this.f20792c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f20790a;
    }
}
