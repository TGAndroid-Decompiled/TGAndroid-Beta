package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class pu implements org.telegram.ui.Components.fl0, org.telegram.ui.ActionBar.c2 {
    public final tu f37540a;

    public pu(tu tuVar) {
        this.f37540a = tuVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12;
        int i13;
        tu tuVar = this.f37540a;
        xu xuVar = tuVar.f38761l3;
        ArrayList arrayList = tuVar.c3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            su[] suVarArr = tuVar.f38753d3;
            if (i14 >= suVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.p2) xuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                tuVar.U2 = true;
                tuVar.z1();
                tuVar.A1(true);
                return;
            }
            su suVar = suVarArr[i14];
            if (suVar.f29422c > 0) {
                arrayList.add(Integer.valueOf(suVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        tu tuVar = this.f37540a;
        ArrayList arrayList = tuVar.Z2;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((ou) arrayList.get(i10)).f1808a == 5) {
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
        tuVar.W2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
