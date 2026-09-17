package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f21671a;
    public int f21672b;
    public int[] f21673c = null;
    public int d = 1;
    public Utilities.Callback2Return e;

    public final int a() {
        int[] iArr = this.f21673c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f21672b;
    }

    public final int b() {
        int[] iArr = this.f21673c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f21671a;
    }
}
