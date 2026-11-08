package org.telegram.ui;

import java.util.ArrayList;
public final class dt implements org.telegram.ui.Components.yi0, org.telegram.ui.ActionBar.r1 {
    public final gt f45130a;

    public dt(gt gtVar) {
        this.f45130a = gtVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        gt gtVar = this.f45130a;
        kt ktVar = gtVar.f46109v3;
        ArrayList arrayList = gtVar.f46100m3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            ft[] ftVarArr = gtVar.f46101n3;
            if (i13 >= ftVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                org.telegram.messenger.jz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                org.telegram.messenger.jz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.f2) ktVar).currentAccount;
                org.telegram.messenger.jz.e(i12).l(2);
                gtVar.f46093e3 = true;
                gtVar.C1();
                gtVar.D1(true);
                return;
            }
            ft ftVar = ftVarArr[i13];
            if (ftVar.f35962c > 0) {
                arrayList.add(Integer.valueOf(ftVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        gt gtVar = this.f45130a;
        ArrayList arrayList = gtVar.j3;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (((ct) arrayList.get(i7)).f54531a == 5) {
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
        gtVar.f46095g3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
