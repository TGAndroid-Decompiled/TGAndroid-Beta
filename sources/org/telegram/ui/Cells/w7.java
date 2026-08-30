package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class w7 {
    public int f22546a;
    public int f22547b;
    public int[] f22548c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f22548c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f22547b;
    }

    public final int b() {
        int[] iArr = this.f22548c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f22546a;
    }
}
