package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class pu implements org.telegram.ui.Components.dm0, org.telegram.ui.ActionBar.z1 {
    public final tu f40959a;

    public pu(tu tuVar) {
        this.f40959a = tuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        tu tuVar = this.f40959a;
        xu xuVar = tuVar.f42277m3;
        ArrayList arrayList = tuVar.f42269d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            su[] suVarArr = tuVar.f42270e3;
            if (i14 >= suVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) xuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) xuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) xuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                tuVar.V2 = true;
                tuVar.A1();
                tuVar.B1(true);
                return;
            }
            su suVar = suVarArr[i14];
            if (suVar.f26335c > 0) {
                arrayList.add(Integer.valueOf(suVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        tu tuVar = this.f40959a;
        ArrayList arrayList = tuVar.f42266a3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((ou) arrayList.get(i10)).f17175a == 5) {
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
        tuVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
