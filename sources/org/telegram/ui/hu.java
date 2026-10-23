package org.telegram.ui;

import android.content.Context;
public final class hu extends org.telegram.ui.Components.dd {
    public final iu f37962e0;

    public hu(iu iuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f37962e0 = iuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        ku kuVar = (ku) this.f37962e0.e;
        if (!z10) {
            kuVar.l1();
        } else if (i10 >= 0 && i10 < kuVar.f39066h3.length) {
            int i12 = 0;
            while (true) {
                ju[] juVarArr = kuVar.f39066h3;
                i11 = -1;
                if (i12 < juVarArr.length) {
                    if (juVarArr[i12].d == i10) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 < kuVar.f39062d3.size()) {
                    fu fuVar = (fu) kuVar.f39062d3.get(i13);
                    if (fuVar != null && fuVar.f44713a == 2 && fuVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                kuVar.f1(new i2.v(i11, 7), 0, true);
            } else {
                kuVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
