package org.telegram.ui;

import android.content.Context;
public final class et extends org.telegram.ui.Components.nc {
    public final org.telegram.ui.Components.yh0 f45404e0;

    public et(org.telegram.ui.Components.yh0 yh0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f45404e0 = yh0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i7, boolean z9) {
        int i10;
        gt gtVar = (gt) this.f45404e0.f40616e;
        if (!z9) {
            gtVar.l1();
        } else if (i7 >= 0 && i7 < gtVar.f46081n3.length) {
            int i11 = 0;
            while (true) {
                ft[] ftVarArr = gtVar.f46081n3;
                i10 = -1;
                if (i11 < ftVarArr.length) {
                    if (ftVarArr[i11].d == i7) {
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
                if (i12 < gtVar.j3.size()) {
                    ct ctVar = (ct) gtVar.j3.get(i12);
                    if (ctVar != null && ctVar.f54415a == 2 && ctVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                gtVar.e1(new l2.u(i10, 3), 0, true);
            } else {
                gtVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
