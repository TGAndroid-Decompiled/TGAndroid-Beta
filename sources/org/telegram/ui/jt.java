package org.telegram.ui;

import java.util.ArrayList;
public final class jt implements org.telegram.ui.Components.lj0, org.telegram.ui.ActionBar.r1 {
    public final mt f49080a;

    public jt(mt mtVar) {
        this.f49080a = mtVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11;
        int i12;
        mt mtVar = this.f49080a;
        pt ptVar = mtVar.f49969w3;
        ArrayList arrayList = mtVar.f49960n3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            lt[] ltVarArr = mtVar.f49961o3;
            if (i13 >= ltVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                org.telegram.messenger.cz.e(i10).l(0);
                i11 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                org.telegram.messenger.cz.e(i11).l(1);
                i12 = ((org.telegram.ui.ActionBar.h2) ptVar).currentAccount;
                org.telegram.messenger.cz.e(i12).l(2);
                mtVar.f49953f3 = true;
                mtVar.C1();
                mtVar.D1(true);
                return;
            }
            lt ltVar = ltVarArr[i13];
            if (ltVar.f38759c > 0) {
                arrayList.add(Integer.valueOf(ltVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        mt mtVar = this.f49080a;
        ArrayList arrayList = mtVar.f49957k3;
        int i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                if (((ht) arrayList.get(i7)).f56589a == 5) {
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
        mtVar.f49955h3.h1(i7, org.telegram.messenger.g0.L(60.0f));
        return i7;
    }
}
