package org.telegram.ui;

import android.content.Context;
public final class kt extends org.telegram.ui.Components.rc {
    public final org.telegram.ui.Components.ni0 f49354f0;

    public kt(org.telegram.ui.Components.ni0 ni0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f49354f0 = ni0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i7, boolean z10) {
        int i10;
        mt mtVar = (mt) this.f49354f0.f37840e;
        if (!z10) {
            mtVar.l1();
        } else if (i7 >= 0 && i7 < mtVar.f49950o3.length) {
            int i11 = 0;
            while (true) {
                lt[] ltVarArr = mtVar.f49950o3;
                i10 = -1;
                if (i11 < ltVarArr.length) {
                    if (ltVarArr[i11].d == i7) {
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
                if (i12 < mtVar.f49946k3.size()) {
                    ht htVar = (ht) mtVar.f49946k3.get(i12);
                    if (htVar != null && htVar.f56599a == 2 && htVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                mtVar.e1(new l2.t(i10, 3), 0, true);
            } else {
                mtVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
