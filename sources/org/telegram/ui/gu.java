package org.telegram.ui;

import android.content.Context;
public final class gu extends org.telegram.ui.Components.ic {
    public final org.telegram.ui.Components.dj0 f37566e0;

    public gu(org.telegram.ui.Components.dj0 dj0Var, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f37566e0 = dj0Var;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        iu iuVar = (iu) this.f37566e0.e;
        if (!z10) {
            iuVar.l1();
        } else if (i10 >= 0 && i10 < iuVar.f38181n3.length) {
            int i12 = 0;
            while (true) {
                hu[] huVarArr = iuVar.f38181n3;
                i11 = -1;
                if (i12 < huVarArr.length) {
                    if (huVarArr[i12].d == i10) {
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
                if (i13 < iuVar.f38177j3.size()) {
                    eu euVar = (eu) iuVar.f38177j3.get(i13);
                    if (euVar != null && euVar.f7681a == 2 && euVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                iuVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                iuVar.l1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
