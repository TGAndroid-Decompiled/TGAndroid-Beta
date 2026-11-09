package org.telegram.ui;

import java.util.ArrayList;
public final class ft implements org.telegram.ui.Components.zi0, org.telegram.ui.ActionBar.r1 {
    public final jt f45785a;

    public ft(jt jtVar) {
        this.f45785a = jtVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        jt jtVar = this.f45785a;
        mt mtVar = jtVar.f47096v3;
        ArrayList arrayList = jtVar.f47087m3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            ht[] htVarArr = jtVar.f47088n3;
            if (i13 >= htVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                org.telegram.messenger.jz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                org.telegram.messenger.jz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.f2) mtVar).currentAccount;
                org.telegram.messenger.jz.e(i12).l(2);
                jtVar.f47080e3 = true;
                jtVar.C1();
                jtVar.D1(true);
                return;
            }
            ht htVar = htVarArr[i13];
            if (htVar.f36060c > 0) {
                arrayList.add(Integer.valueOf(htVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        jt jtVar = this.f45785a;
        ArrayList arrayList = jtVar.j3;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (((et) arrayList.get(i7)).f54544a == 5) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 < 0) {
            return -1;
        }
        jtVar.f47082g3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
