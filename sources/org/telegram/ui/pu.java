package org.telegram.ui;

import android.content.Context;
public final class pu extends org.telegram.ui.Components.dd {
    public final qu f36209e0;

    public pu(qu quVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f36209e0 = quVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        su suVar = (su) this.f36209e0.e;
        if (!z10) {
            suVar.j1();
        } else if (i10 >= 0 && i10 < suVar.f37425g3.length) {
            int i12 = 0;
            while (true) {
                ru[] ruVarArr = suVar.f37425g3;
                i11 = -1;
                if (i12 < ruVarArr.length) {
                    if (ruVarArr[i12].d == i10) {
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
                if (i13 < suVar.f37421c3.size()) {
                    nu nuVar = (nu) suVar.f37421c3.get(i13);
                    if (nuVar != null && nuVar.f15508a == 2 && nuVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                suVar.e1(new i2.w(i11, 7), 0, true);
            } else {
                suVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
