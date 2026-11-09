package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class rr0 implements Runnable {
    public final int f37788a;
    public final sr0 f37789b;
    public final String f37790c;

    public rr0(sr0 sr0Var, String str, int i7) {
        this.f37788a = i7;
        this.f37789b = sr0Var;
        this.f37790c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f37788a) {
            case 0:
                sr0 sr0Var = this.f37789b;
                String str = this.f37790c;
                sr0Var.getClass();
                org.telegram.messenger.g0.h3(new rr0(sr0Var, str, 1));
                return;
            default:
                sr0 sr0Var2 = this.f37789b;
                String str2 = this.f37790c;
                ArrayList arrayList = null;
                sr0Var2.f38143f = null;
                if (!org.telegram.messenger.t3.T(sr0Var2.f38144n) && sr0Var2.f38146s.f41076f1 != null) {
                    arrayList = new ArrayList(sr0Var2.f38146s.f41076f1.participants.participants);
                }
                sr0Var2.f38145r = 2;
                if (arrayList != null) {
                    Utilities.f21338g.c(new ng(sr0Var2, str2, arrayList, 22));
                } else {
                    sr0Var2.f38145r = 1;
                }
                jg.z1 z1Var = sr0Var2.f38142e;
                if (org.telegram.messenger.t3.T(sr0Var2.f38144n)) {
                    j3 = sr0Var2.f38144n.f26956id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
