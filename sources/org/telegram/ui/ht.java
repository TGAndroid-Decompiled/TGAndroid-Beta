package org.telegram.ui;

import android.content.Context;
public final class ht extends org.telegram.ui.Components.ic {
    public final org.telegram.ui.Components.ci0 f47810f0;

    public ht(org.telegram.ui.Components.ci0 ci0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f47810f0 = ci0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i7, boolean z10) {
        int i10;
        kt ktVar = (kt) this.f47810f0.f33613e;
        if (!z10) {
            ktVar.l1();
        } else if (i7 >= 0 && i7 < ktVar.f48761o3.length) {
            int i11 = 0;
            while (true) {
                jt[] jtVarArr = ktVar.f48761o3;
                i10 = -1;
                if (i11 < jtVarArr.length) {
                    if (jtVarArr[i11].d == i7) {
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
                if (i12 < ktVar.f48757k3.size()) {
                    ft ftVar = (ft) ktVar.f48757k3.get(i12);
                    if (ftVar != null && ftVar.f56015a == 2 && ftVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                ktVar.e1(new l2.t(i10, 3), 0, true);
            } else {
                ktVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
