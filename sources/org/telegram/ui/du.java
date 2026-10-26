package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class du implements org.telegram.ui.Components.wl0, org.telegram.ui.ActionBar.b2 {
    public final hu f38931a;

    public du(hu huVar) {
        this.f38931a = huVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        hu huVar = this.f38931a;
        lu luVar = huVar.f40087w3;
        ArrayList arrayList = huVar.f40078n3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            gu[] guVarArr = huVar.f40079o3;
            if (i14 >= guVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.r2) luVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.r2) luVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.r2) luVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                huVar.f40070f3 = true;
                huVar.F1();
                huVar.G1(true);
                return;
            }
            gu guVar = guVarArr[i14];
            if (guVar.f26831c > 0) {
                arrayList.add(Integer.valueOf(guVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        hu huVar = this.f38931a;
        ArrayList arrayList = huVar.f40075k3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((cu) arrayList.get(i10)).f47040a == 5) {
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
        huVar.f40072h3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
