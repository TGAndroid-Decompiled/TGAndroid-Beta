package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class nu implements org.telegram.ui.Components.hl0, org.telegram.ui.ActionBar.z1 {
    public final ru f36001a;

    public nu(ru ruVar) {
        this.f36001a = ruVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ru ruVar = this.f36001a;
        vu vuVar = ruVar.f37477o3;
        ArrayList arrayList = ruVar.f37469f3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            qu[] quVarArr = ruVar.f37470g3;
            if (i14 >= quVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                ruVar.X2 = true;
                ruVar.z1();
                ruVar.A1(true);
                return;
            }
            qu quVar = quVarArr[i14];
            if (quVar.f23313c > 0) {
                arrayList.add(Integer.valueOf(quVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        ru ruVar = this.f36001a;
        ArrayList arrayList = ruVar.f37466c3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((mu) arrayList.get(i10)).f15715a == 5) {
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
        ruVar.Z2.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
