package org.telegram.ui.Cells;

import org.telegram.messenger.Utilities;
public final class y7 {
    public int f23597a;
    public int f23598b;
    public int[] f23599c = null;
    public int d = 1;
    public Utilities.Callback2Return f23600e;

    public final int a() {
        int[] iArr = this.f23599c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23598b;
    }

    public final int b() {
        int[] iArr = this.f23599c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23597a;
    }
}
