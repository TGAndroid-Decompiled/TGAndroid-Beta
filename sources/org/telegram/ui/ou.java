package org.telegram.ui;

import android.content.Context;
public final class ou extends org.telegram.ui.Components.ed {
    public final pu f36451e0;

    public ou(pu puVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f36451e0 = puVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        ru ruVar = (ru) this.f36451e0.e;
        if (!z10) {
            ruVar.m1();
        } else if (i10 >= 0 && i10 < ruVar.f37565n3.length) {
            int i12 = 0;
            while (true) {
                qu[] quVarArr = ruVar.f37565n3;
                i11 = -1;
                if (i12 < quVarArr.length) {
                    if (quVarArr[i12].d == i10) {
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
                if (i13 < ruVar.j3.size()) {
                    mu muVar = (mu) ruVar.j3.get(i13);
                    if (muVar != null && muVar.f15731a == 2 && muVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                ruVar.f1(new i2.w(i11, 7), 0, true);
            } else {
                ruVar.m1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
