package org.telegram.ui;

import android.content.Context;
public final class iu extends org.telegram.ui.Components.zc {
    public final ju f39338a0;

    public iu(ju juVar, Context context, int i10, int[] iArr, int[] iArr2) {
        super(context, i10, iArr, 1, iArr2);
        this.f39338a0 = juVar;
    }

    @Override
    public final int c() {
        return 216;
    }

    @Override
    public final void d(int i10, boolean z10) {
        int i11;
        lu luVar = (lu) this.f39338a0.f39690e;
        if (!z10) {
            luVar.j1();
        } else if (i10 >= 0 && i10 < luVar.c3.length) {
            int i12 = 0;
            while (true) {
                ku[] kuVarArr = luVar.c3;
                i11 = -1;
                if (i12 < kuVarArr.length) {
                    if (kuVarArr[i12].d == i10) {
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
                if (i13 < luVar.Y2.size()) {
                    gu guVar = (gu) luVar.Y2.get(i13);
                    if (guVar != null && guVar.f50845a == 2 && guVar.h == i12) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (i11 >= 0) {
                luVar.e1(new j3.x(i11, 2), 0, true);
            } else {
                luVar.j1();
            }
        }
    }

    @Override
    public final int e() {
        return 10;
    }
}
