package org.telegram.ui;

import android.content.Context;
public final class hu extends org.telegram.ui.Components.uc {
    public final iu f38940a0;

    public hu(iu iuVar, Context context, int i9, int[] iArr, int[] iArr2) {
        super(context, i9, iArr, 1, iArr2);
        this.f38940a0 = iuVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i9, boolean z10) {
        int i10;
        ku kuVar = (ku) this.f38940a0.f39284e;
        if (!z10) {
            kuVar.j1();
        } else if (i9 >= 0 && i9 < kuVar.f39922c3.length) {
            int i11 = 0;
            while (true) {
                ju[] juVarArr = kuVar.f39922c3;
                i10 = -1;
                if (i11 < juVarArr.length) {
                    if (juVarArr[i11].d == i9) {
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
                if (i12 < kuVar.Y2.size()) {
                    fu fuVar = (fu) kuVar.Y2.get(i12);
                    if (fuVar != null && fuVar.f48814a == 2 && fuVar.h == i11) {
                        i10 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            if (i10 >= 0) {
                kuVar.e1(new h3.x(i10, 2), 0, true);
            } else {
                kuVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
