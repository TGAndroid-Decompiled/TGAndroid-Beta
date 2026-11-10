package org.telegram.ui;

import java.util.ArrayList;
public final class gt implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final kt f46152a;

    public gt(kt ktVar) {
        this.f46152a = ktVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        kt ktVar = this.f46152a;
        nt ntVar = ktVar.f47430v3;
        ArrayList arrayList = ktVar.f47421m3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            jt[] jtVarArr = ktVar.f47422n3;
            if (i13 >= jtVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                org.telegram.messenger.jz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                org.telegram.messenger.jz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                org.telegram.messenger.jz.e(i12).l(2);
                ktVar.f47414e3 = true;
                ktVar.C1();
                ktVar.D1(true);
                return;
            }
            jt jtVar = jtVarArr[i13];
            if (jtVar.f35644c > 0) {
                arrayList.add(Integer.valueOf(jtVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        kt ktVar = this.f46152a;
        ArrayList arrayList = ktVar.j3;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (((ft) arrayList.get(i7)).f54543a == 5) {
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
        ktVar.f47416g3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
