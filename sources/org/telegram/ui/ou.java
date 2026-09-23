package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class ou implements org.telegram.ui.Components.xk0, org.telegram.ui.ActionBar.a2 {
    public final su f35958a;

    public ou(su suVar) {
        this.f35958a = suVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12;
        int i13;
        su suVar = this.f35958a;
        wu wuVar = suVar.f37432o3;
        ArrayList arrayList = suVar.f37424f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            ru[] ruVarArr = suVar.f37425g3;
            if (i14 >= ruVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.n2) wuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                suVar.X2 = true;
                suVar.z1();
                suVar.A1(true);
                return;
            }
            ru ruVar = ruVarArr[i14];
            if (ruVar.f23011c > 0) {
                arrayList.add(Integer.valueOf(ruVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        su suVar = this.f35958a;
        ArrayList arrayList = suVar.f37421c3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((nu) arrayList.get(i10)).f15508a == 5) {
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
        suVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
