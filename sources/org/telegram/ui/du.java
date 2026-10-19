package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class du implements org.telegram.ui.Components.tl0, org.telegram.ui.ActionBar.a2 {
    public final hu f36443a;

    public du(hu huVar) {
        this.f36443a = huVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        hu huVar = this.f36443a;
        lu luVar = huVar.f37795m3;
        ArrayList arrayList = huVar.f37786d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            gu[] guVarArr = huVar.f37787e3;
            if (i14 >= guVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) luVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                huVar.V2 = true;
                huVar.A1();
                huVar.B1(true);
                return;
            }
            gu guVar = guVarArr[i14];
            if (guVar.f25170c > 0) {
                arrayList.add(Integer.valueOf(guVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        hu huVar = this.f36443a;
        ArrayList arrayList = huVar.f37783a3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((cu) arrayList.get(i10)).f44288a == 5) {
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
        huVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
