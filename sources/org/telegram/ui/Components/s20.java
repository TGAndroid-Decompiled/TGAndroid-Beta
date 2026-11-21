package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class s20 implements Runnable {
    public final int f39471a;
    public final u20 f39472b;
    public final String f39473c;
    public final int d;

    public s20(u20 u20Var, String str, int i7, int i10) {
        this.f39471a = i10;
        this.f39472b = u20Var;
        this.f39473c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39471a) {
            case 0:
                u20 u20Var = this.f39472b;
                String str = this.f39473c;
                int i7 = this.d;
                if (u20Var.f40218e != null) {
                    u20Var.f40218e = null;
                    org.telegram.messenger.g0.g3(new s20(u20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                u20 u20Var2 = this.f39472b;
                String str2 = this.f39473c;
                int i10 = this.d;
                ArrayList arrayList = null;
                u20Var2.f40218e = null;
                if (!org.telegram.messenger.v3.T(u20Var2.f40224x.Q1) && u20Var2.f40224x.R1 != null) {
                    arrayList = new ArrayList(u20Var2.f40224x.R1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.f22809g.c(new bi.x4(u20Var2, str2, i10, arrayList));
                } else {
                    u20Var2.h = false;
                }
                jg.z1 z1Var = u20Var2.d;
                boolean w10 = org.telegram.messenger.v3.w(3, u20Var2.f40224x.Q1);
                if (org.telegram.messenger.v3.T(u20Var2.f40224x.Q1)) {
                    j3 = u20Var2.f40224x.Q1.f28431id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
