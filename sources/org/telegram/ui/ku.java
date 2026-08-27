package org.telegram.ui;

import android.content.Context;

public final class ku extends org.telegram.ui.Components.sc {

    public final lu f39886a0;

    public ku(lu luVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f39886a0 = luVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        nu nuVar = (nu) this.f39886a0.f40250e;
        if (!z10) {
            nuVar.j1();
            return;
        }
        if (i10 < 0 || i10 >= nuVar.f40931c3.length) {
            return;
        }
        int i12 = 0;
        while (true) {
            mu[] muVarArr = nuVar.f40931c3;
            i11 = -1;
            if (i12 >= muVarArr.length) {
                i12 = -1;
                break;
            } else if (muVarArr[i12].d == i10) {
                break;
            } else {
                i12++;
            }
        }
        for (int i13 = 0; i13 < nuVar.Y2.size(); i13++) {
            iu iuVar = (iu) nuVar.Y2.get(i13);
            if (iuVar != null && iuVar.f49413a == 2 && iuVar.h == i12) {
                i11 = i13;
                break;
            }
        }
        if (i11 >= 0) {
            nuVar.e1(new h3.y(i11, 2), 0, true);
        } else {
            nuVar.j1();
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
