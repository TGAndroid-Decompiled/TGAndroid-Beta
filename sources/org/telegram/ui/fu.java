package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class fu implements org.telegram.ui.Components.tl0, org.telegram.ui.ActionBar.a2 {
    public final ju f37042a;

    public fu(ju juVar) {
        this.f37042a = juVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ju juVar = this.f37042a;
        nu nuVar = juVar.f38348m3;
        ArrayList arrayList = juVar.f38339d3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            iu[] iuVarArr = juVar.f38340e3;
            if (i14 >= iuVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) nuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) nuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) nuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                juVar.V2 = true;
                juVar.A1();
                juVar.B1(true);
                return;
            }
            iu iuVar = iuVarArr[i14];
            if (iuVar.f25194c > 0) {
                arrayList.add(Integer.valueOf(iuVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        ju juVar = this.f37042a;
        ArrayList arrayList = juVar.f38336a3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((eu) arrayList.get(i10)).f44314a == 5) {
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
        juVar.X2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
