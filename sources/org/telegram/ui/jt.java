package org.telegram.ui;

import android.content.Context;
public final class jt extends org.telegram.ui.Components.qc {
    public final org.telegram.ui.Components.ni0 f49204f0;

    public jt(org.telegram.ui.Components.ni0 ni0Var, Context context, int i7, int[] iArr, int[] iArr2) {
        super(context, i7, iArr, 1, iArr2);
        this.f49204f0 = ni0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i7, boolean z10) {
        int i10;
        lt ltVar = (lt) this.f49204f0.f37836e;
        if (!z10) {
            ltVar.l1();
        } else if (i7 >= 0 && i7 < ltVar.f49831o3.length) {
            int i11 = 0;
            while (true) {
                kt[] ktVarArr = ltVar.f49831o3;
                i10 = -1;
                if (i11 < ktVarArr.length) {
                    if (ktVarArr[i11].d == i7) {
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
                if (i12 < ltVar.f49827k3.size()) {
                    gt gtVar = (gt) ltVar.f49827k3.get(i12);
                    if (gtVar != null && gtVar.f56712a == 2 && gtVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                ltVar.e1(new l2.u(i10, 3), 0, true);
            } else {
                ltVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
