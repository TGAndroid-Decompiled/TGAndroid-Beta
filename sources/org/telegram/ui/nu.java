package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class nu implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.z1 {
    public final ru f36139a;

    public nu(ru ruVar) {
        this.f36139a = ruVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12;
        int i13;
        ru ruVar = this.f36139a;
        vu vuVar = ruVar.f37573v3;
        ArrayList arrayList = ruVar.f37564m3;
        arrayList.clear();
        int i14 = 0;
        while (true) {
            qu[] quVarArr = ruVar.f37565n3;
            if (i14 >= quVarArr.length) {
                i11 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i11).resetStats(0);
                i12 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i12).resetStats(1);
                i13 = ((org.telegram.ui.ActionBar.m2) vuVar).currentAccount;
                StatsController.getInstance(i13).resetStats(2);
                ruVar.f37557e3 = true;
                ruVar.B1();
                ruVar.C1(true);
                return;
            }
            qu quVar = quVarArr[i14];
            if (quVar.f23611c > 0) {
                arrayList.add(Integer.valueOf(quVar.d));
            }
            i14++;
        }
    }

    @Override
    public int run() {
        ru ruVar = this.f36139a;
        ArrayList arrayList = ruVar.j3;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((mu) arrayList.get(i10)).f15731a == 5) {
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
        ruVar.f37559g3.h1(i10, AndroidUtilities.dp(60.0f));
        return i10;
    }
}
