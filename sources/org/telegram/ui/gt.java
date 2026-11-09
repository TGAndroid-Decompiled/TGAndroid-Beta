package org.telegram.ui;

import android.content.Context;
public final class gt extends org.telegram.ui.Components.nc {
    public final org.telegram.ui.Components.zh0 f46063e0;

    public gt(org.telegram.ui.Components.zh0 zh0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f46063e0 = zh0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i7, boolean z9) {
        int i10;
        jt jtVar = (jt) this.f46063e0.f40984e;
        if (!z9) {
            jtVar.l1();
        } else if (i7 >= 0 && i7 < jtVar.f47088n3.length) {
            int i11 = 0;
            while (true) {
                ht[] htVarArr = jtVar.f47088n3;
                i10 = -1;
                if (i11 < htVarArr.length) {
                    if (htVarArr[i11].d == i7) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (i12 < jtVar.j3.size()) {
                    et etVar = (et) jtVar.j3.get(i12);
                    if (etVar != null && etVar.f54544a == 2 && etVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                jtVar.e1(new l2.u(i10, 3), 0, true);
            } else {
                jtVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
