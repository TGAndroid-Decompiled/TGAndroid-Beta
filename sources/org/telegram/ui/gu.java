package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
public final class gu implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.b2 {
    public final ku f38604a;

    public gu(ku kuVar) {
        this.f38604a = kuVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        int i11;
        int i12;
        ku kuVar = this.f38604a;
        ou ouVar = kuVar.f39930k3;
        ArrayList arrayList = kuVar.f39921b3;
        arrayList.clear();
        int i13 = 0;
        while (true) {
            ju[] juVarArr = kuVar.f39922c3;
            if (i13 >= juVarArr.length) {
                i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i10).resetStats(0);
                i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i11).resetStats(1);
                i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                StatsController.getInstance(i12).resetStats(2);
                kuVar.T2 = true;
                kuVar.z1();
                kuVar.A1(true);
                return;
            }
            ju juVar = juVarArr[i13];
            if (juVar.f32679c > 0) {
                arrayList.add(Integer.valueOf(juVar.d));
            }
            i13++;
        }
    }

    @Override
    public int run() {
        ku kuVar = this.f38604a;
        ArrayList arrayList = kuVar.Y2;
        int i9 = 0;
        while (true) {
            if (i9 < arrayList.size()) {
                if (((fu) arrayList.get(i9)).f48814a == 5) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 < 0) {
            return -1;
        }
        kuVar.V2.h1(i9, AndroidUtilities.dp(60.0f));
        return i9;
    }
}
