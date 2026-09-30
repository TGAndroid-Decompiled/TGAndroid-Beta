package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f21906a;
    public int f21907b;
    public int[] f21908c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f21908c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f21907b;
    }

    public final int b() {
        int[] iArr = this.f21908c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f21906a;
    }
}
