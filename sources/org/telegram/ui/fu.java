package org.telegram.ui;

import java.util.ArrayList;
public final class fu implements org.telegram.ui.Components.ek0, org.telegram.ui.ActionBar.u1 {
    public final iu f37234a;

    public fu(iu iuVar) {
        this.f37234a = iuVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        iu iuVar = this.f37234a;
        lu luVar = iuVar.f38189v3;
        ArrayList arrayList = iuVar.f38180m3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            hu[] huVarArr = iuVar.f38181n3;
            if (i14 >= huVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                org.telegram.messenger.vz.e(i11).l(0);
                i12 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                org.telegram.messenger.vz.e(i12).l(1);
                i13 = ((org.telegram.ui.ActionBar.k2) luVar).currentAccount;
                org.telegram.messenger.vz.e(i13).l(2);
                iuVar.f38172e3 = true;
                iuVar.C1();
                iuVar.D1(true);
                return;
            }
            hu huVar = huVarArr[i14];
            if (huVar.f26752c > 0) {
                arrayList.add(Integer.valueOf(huVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        iu iuVar = this.f37234a;
        ArrayList arrayList = iuVar.f38177j3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((eu) arrayList.get(i10)).f7681a == 5) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return -1;
        }
        iuVar.f38174g3.h1(i10, org.telegram.messenger.i0.L(60.0f));
        return i10;
    }
}
