package org.telegram.ui;

import java.util.ArrayList;
public final class ht implements org.telegram.ui.Components.nj0, org.telegram.ui.ActionBar.q1 {
    public final lt f48628a;

    public ht(lt ltVar) {
        this.f48628a = ltVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11;
        int i12;
        lt ltVar = this.f48628a;
        ot otVar = ltVar.f49839w3;
        ArrayList arrayList = ltVar.f49830n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            kt[] ktVarArr = ltVar.f49831o3;
            if (i13 >= ktVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.g2) otVar).currentAccount;
                org.telegram.messenger.cz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.g2) otVar).currentAccount;
                org.telegram.messenger.cz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.g2) otVar).currentAccount;
                org.telegram.messenger.cz.e(i12).l(2);
                ltVar.f49823f3 = true;
                ltVar.C1();
                ltVar.D1(true);
                return;
            }
            kt ktVar = ktVarArr[i13];
            if (ktVar.f38449c > 0) {
                arrayList.add(Integer.valueOf(ktVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        lt ltVar = this.f48628a;
        ArrayList arrayList = ltVar.f49827k3;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (((gt) arrayList.get(i7)).f56712a == 5) {
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
        ltVar.f49825h3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
