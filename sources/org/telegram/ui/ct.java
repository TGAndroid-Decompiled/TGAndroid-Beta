package org.telegram.ui;

import android.content.Context;
public final class ct extends org.telegram.ui.Components.lc {
    public final org.telegram.ui.Components.bi0 f44431f0;

    public ct(org.telegram.ui.Components.bi0 bi0Var, Context context, int i3, int[] iArr, int[] iArr2) {
        super(context, i3, iArr, 1, iArr2);
        this.f44431f0 = bi0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i3, boolean z10) {
        int i10;
        et etVar = (et) this.f44431f0.f32302e;
        if (!z10) {
            etVar.l1();
        } else if (i3 >= 0 && i3 < etVar.f45037o3.length) {
            int i11 = 0;
            while (true) {
                dt[] dtVarArr = etVar.f45037o3;
                i10 = -1;
                if (i11 < dtVarArr.length) {
                    if (dtVarArr[i11].d == i3) {
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
                if (i12 < etVar.f45033k3.size()) {
                    at atVar = (at) etVar.f45033k3.get(i12);
                    if (atVar != null && atVar.f54715a == 2 && atVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                etVar.e1(new k2.v(i10, 7), 0, true);
            } else {
                etVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
