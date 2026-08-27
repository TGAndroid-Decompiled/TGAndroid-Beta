package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;

public final class ju implements org.telegram.ui.Components.mk0, org.telegram.ui.ActionBar.a2 {

    public final nu f39501a;

    public ju(nu nuVar) {
        this.f39501a = nuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        nu nuVar = this.f39501a;
        ru ruVar = nuVar.f40939k3;
        ArrayList arrayList = nuVar.f40930b3;
        arrayList.clear();
        int i11 = 0;
        while (true) {
            mu[] muVarArr = nuVar.f40931c3;
            if (i11 >= muVarArr.length) {
                StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).resetStats(0);
                StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).resetStats(1);
                StatsController.getInstance(((org.telegram.ui.ActionBar.n2) ruVar).currentAccount).resetStats(2);
                nuVar.T2 = true;
                nuVar.z1();
                nuVar.A1(true);
                return;
            }
            mu muVar = muVarArr[i11];
            if (muVar.f32127c > 0) {
                arrayList.add(Integer.valueOf(muVar.d));
            }
            i11++;
        }
    }

    @Override
    public int run() {
        nu nuVar = this.f39501a;
        ArrayList arrayList = nuVar.Y2;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            if (((iu) arrayList.get(i10)).f49413a == 5) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return -1;
        }
        nuVar.V2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
