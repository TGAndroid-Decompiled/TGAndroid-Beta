package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class fu implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.b2 {
    public final ju f39424a;

    public fu(ju juVar) {
        this.f39424a = juVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ju juVar = this.f39424a;
        nu nuVar = juVar.f40613w3;
        ArrayList arrayList = juVar.f40604n3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            iu[] iuVarArr = juVar.f40605o3;
            if (i14 >= iuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.r2) nuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                juVar.f40596f3 = true;
                juVar.F1();
                juVar.G1(true);
                return;
            }
            iu iuVar = iuVarArr[i14];
            if (iuVar.f26810c > 0) {
                arrayList.add(Integer.valueOf(iuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        ju juVar = this.f39424a;
        ArrayList arrayList = juVar.f40601k3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((eu) arrayList.get(i10)).f47075a == 5) {
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
        juVar.f40598h3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
