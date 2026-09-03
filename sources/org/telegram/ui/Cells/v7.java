package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class v7 {
    public int f22474a;
    public int f22475b;
    public int[] f22476c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f22476c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f22475b;
    }

    public final int b() {
        int[] iArr = this.f22476c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f22474a;
    }
}
