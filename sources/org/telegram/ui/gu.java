package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class gu implements org.telegram.ui.Components.wl0, org.telegram.ui.ActionBar.z1 {
    public final ku f37658a;

    public gu(ku kuVar) {
        this.f37658a = kuVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ku kuVar = this.f37658a;
        ou ouVar = kuVar.f39051p3;
        ArrayList arrayList = kuVar.f39042g3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            ju[] juVarArr = kuVar.f39043h3;
            if (i14 >= juVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                kuVar.Y2 = true;
                kuVar.F1();
                kuVar.G1(true);
                return;
            }
            ju juVar = juVarArr[i14];
            if (juVar.f24712c > 0) {
                arrayList.add(Integer.valueOf(juVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        ku kuVar = this.f37658a;
        ArrayList arrayList = kuVar.f39039d3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((fu) arrayList.get(i10)).f44712a == 5) {
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
        kuVar.f39036a3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
