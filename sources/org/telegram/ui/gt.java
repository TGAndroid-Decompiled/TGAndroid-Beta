package org.telegram.ui;

import java.util.ArrayList;
public final class gt implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.q1 {
    public final kt f47510a;

    public gt(kt ktVar) {
        this.f47510a = ktVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        kt ktVar = this.f47510a;
        nt ntVar = ktVar.f48769w3;
        ArrayList arrayList = ktVar.f48760n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            jt[] jtVarArr = ktVar.f48761o3;
            if (i13 >= jtVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                org.telegram.messenger.hz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                org.telegram.messenger.hz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.e2) ntVar).currentAccount;
                org.telegram.messenger.hz.e(i12).l(2);
                ktVar.f48753f3 = true;
                ktVar.C1();
                ktVar.D1(true);
                return;
            }
            jt jtVar = jtVarArr[i13];
            if (jtVar.f35214c > 0) {
                arrayList.add(Integer.valueOf(jtVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        kt ktVar = this.f47510a;
        ArrayList arrayList = ktVar.f48757k3;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (((ft) arrayList.get(i7)).f56015a == 5) {
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
        ktVar.f48755h3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
