package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class s20 implements Runnable {
    public final int f39463a;
    public final u20 f39464b;
    public final String f39465c;
    public final int d;

    public s20(u20 u20Var, String str, int i7, int i10) {
        this.f39463a = i10;
        this.f39464b = u20Var;
        this.f39465c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39463a) {
            case 0:
                u20 u20Var = this.f39464b;
                String str = this.f39465c;
                int i7 = this.d;
                if (u20Var.f40210e != null) {
                    u20Var.f40210e = null;
                    org.telegram.messenger.g0.g3(new s20(u20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                u20 u20Var2 = this.f39464b;
                String str2 = this.f39465c;
                int i10 = this.d;
                ArrayList arrayList = null;
                u20Var2.f40210e = null;
                if (!org.telegram.messenger.v3.T(u20Var2.f40216x.Q1) && u20Var2.f40216x.R1 != null) {
                    arrayList = new ArrayList(u20Var2.f40216x.R1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.f22812g.c(new ai.b1(u20Var2, str2, i10, arrayList));
                } else {
                    u20Var2.h = false;
                }
                jg.z1 z1Var = u20Var2.d;
                boolean w10 = org.telegram.messenger.v3.w(3, u20Var2.f40216x.Q1);
                if (org.telegram.messenger.v3.T(u20Var2.f40216x.Q1)) {
                    j3 = u20Var2.f40216x.Q1.f28434id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
