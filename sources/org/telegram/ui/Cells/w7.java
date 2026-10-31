package org.telegram.ui.Cells;

import org.telegram.messenger.k20;
public final class w7 {
    public int f23406a;
    public int f23407b;
    public int[] f23408c = null;
    public int d = 1;
    public k20 e;

    public final int a() {
        int[] iArr = this.f23408c;
        if (iArr != null) {
            return iArr[iArr.length - 1];
        }
        return this.f23407b;
    }

    public final int b() {
        int[] iArr = this.f23408c;
        if (iArr != null) {
            return iArr[0];
        }
        return this.f23406a;
    }
}
