package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f22785a;
    public int f22786b;
    public int[] f22787c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f22787c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f22786b;
    }

    public final int b() {
        int[] iArr = this.f22787c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f22785a;
    }
}
