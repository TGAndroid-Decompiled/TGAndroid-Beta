package org.telegram.ui;

import java.util.ArrayList;
public final class bt implements org.telegram.ui.Components.cj0, org.telegram.ui.ActionBar.p1 {
    public final et f44138a;

    public bt(et etVar) {
        this.f44138a = etVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        int i11;
        int i12;
        et etVar = this.f44138a;
        ht htVar = etVar.f45045w3;
        ArrayList arrayList = etVar.f45036n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            dt[] dtVarArr = etVar.f45037o3;
            if (i13 >= dtVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                org.telegram.messenger.bz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                org.telegram.messenger.bz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                org.telegram.messenger.bz.e(i12).l(2);
                etVar.f45029f3 = true;
                etVar.C1();
                etVar.D1(true);
                return;
            }
            dt dtVar = dtVarArr[i13];
            if (dtVar.f35364c > 0) {
                arrayList.add(Integer.valueOf(dtVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        et etVar = this.f44138a;
        ArrayList arrayList = etVar.f45033k3;
        int i3 = 0;
        while (true) {
            if (i3 < arrayList.size()) {
                if (((at) arrayList.get(i3)).f54715a == 5) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 < 0) {
            return -1;
        }
        etVar.f45031h3.h1(i3, org.telegram.messenger.g0.L(60.0f));
        return i3;
    }
}
