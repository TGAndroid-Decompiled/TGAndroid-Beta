package org.telegram.ui.Cells;

import org.telegram.messenger.w10;
public final class s7 {
    public int f30282a;
    public int f30283b;
    public int[] f30284c = null;
    public int d = 1;
    public w10 f30285e;

    public final int a() {
        int[] iArr = this.f30284c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f30283b;
    }

    public final int b() {
        int[] iArr = this.f30284c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f30282a;
    }
}
