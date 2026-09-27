package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class pu implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.b2 {
    public final tu f36546a;

    public pu(tu tuVar) {
        this.f36546a = tuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        tu tuVar = this.f36546a;
        xu xuVar = tuVar.f37928o3;
        ArrayList arrayList = tuVar.f37920f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            su[] suVarArr = tuVar.f37921g3;
            if (i14 >= suVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.o2) xuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                tuVar.X2 = true;
                tuVar.A1();
                tuVar.B1(true);
                return;
            }
            su suVar = suVarArr[i14];
            if (suVar.f23299c > 0) {
                arrayList.add(Integer.valueOf(suVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        tu tuVar = this.f36546a;
        ArrayList arrayList = tuVar.f37917c3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((ou) arrayList.get(i10)).f15754a == 5) {
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
        tuVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
