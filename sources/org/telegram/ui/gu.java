package org.telegram.ui;

import java.util.ArrayList;
public final class gu implements org.telegram.ui.Components.dk0, org.telegram.ui.ActionBar.u1 {
    public final ju f37648a;

    public gu(ju juVar) {
        this.f37648a = juVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12;
        int i13;
        ju juVar = this.f37648a;
        mu muVar = juVar.f38606v3;
        ArrayList arrayList = juVar.f38597m3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            iu[] iuVarArr = juVar.f38598n3;
            if (i14 >= iuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                org.telegram.messenger.uz.e(i11).l(0);
                i12 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                org.telegram.messenger.uz.e(i12).l(1);
                i13 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                org.telegram.messenger.uz.e(i13).l(2);
                juVar.f38589e3 = true;
                juVar.C1();
                juVar.D1(true);
                return;
            }
            iu iuVar = iuVarArr[i14];
            if (iuVar.f26694c > 0) {
                arrayList.add(Integer.valueOf(iuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        ju juVar = this.f37648a;
        ArrayList arrayList = juVar.f38594j3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((fu) arrayList.get(i10)).f7680a == 5) {
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
        juVar.f38591g3.h1(i10, org.telegram.messenger.i0.L(60.0f));
        return i10;
    }
}
