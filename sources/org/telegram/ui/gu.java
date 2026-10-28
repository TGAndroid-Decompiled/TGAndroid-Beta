package org.telegram.ui;

import android.content.Context;
public final class gu extends org.telegram.ui.Components.cd {
    public final hu f39691e0;

    public gu(hu huVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f39691e0 = huVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        ju juVar = (ju) this.f39691e0.e;
        if (!z10) {
            juVar.m1();
        } else if (i10 >= 0 && i10 < juVar.f40605o3.length) {
            int i12 = 0;
            while (true) {
                iu[] iuVarArr = juVar.f40605o3;
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
                if (i13 < juVar.f40601k3.size()) {
                    eu euVar = (eu) juVar.f40601k3.get(i13);
                    if (euVar != null && euVar.f47075a == 2 && euVar.h == i12) {
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
                juVar.m1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
