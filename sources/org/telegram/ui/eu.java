package org.telegram.ui;

import android.content.Context;
public final class eu extends org.telegram.ui.Components.cd {
    public final fu f39178e0;

    public eu(fu fuVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f39178e0 = fuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        hu huVar = (hu) this.f39178e0.e;
        if (!z10) {
            huVar.m1();
        } else if (i10 >= 0 && i10 < huVar.f40076o3.length) {
            int i12 = 0;
            while (true) {
                gu[] guVarArr = huVar.f40076o3;
                i11 = -1;
                if (i12 < guVarArr.length) {
                    if (guVarArr[i12].d == i10) {
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
                if (i13 < huVar.f40072k3.size()) {
                    cu cuVar = (cu) huVar.f40072k3.get(i13);
                    if (cuVar != null && cuVar.f47037a == 2 && cuVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                huVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                huVar.m1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
