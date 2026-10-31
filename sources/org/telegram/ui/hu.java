package org.telegram.ui;

import android.content.Context;
public final class hu extends org.telegram.ui.Components.ic {
    public final org.telegram.ui.Components.cj0 f38033e0;

    public hu(org.telegram.ui.Components.cj0 cj0Var, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f38033e0 = cj0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        ju juVar = (ju) this.f38033e0.e;
        if (!z10) {
            juVar.l1();
        } else if (i10 >= 0 && i10 < juVar.f38598n3.length) {
            int i12 = 0;
            while (true) {
                iu[] iuVarArr = juVar.f38598n3;
                i11 = -1;
                if (i12 < iuVarArr.length) {
                    if (iuVarArr[i12].d == i10) {
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
                if (i13 < juVar.f38594j3.size()) {
                    fu fuVar = (fu) juVar.f38594j3.get(i13);
                    if (fuVar != null && fuVar.f7680a == 2 && fuVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                juVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                juVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
