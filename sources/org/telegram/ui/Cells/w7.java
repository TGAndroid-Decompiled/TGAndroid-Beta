package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class w7 {
    public int f24365a;
    public int f24366b;
    public int[] f24367c = null;
    public int d = 1;
    public Utilities.Callback2Return f24368e;

    public final int a() {
        int[] iArr = this.f24367c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f24366b;
    }

    public final int b() {
        int[] iArr = this.f24367c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f24365a;
    }
}
