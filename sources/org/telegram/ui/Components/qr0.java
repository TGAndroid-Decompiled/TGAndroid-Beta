package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qr0 implements Runnable {
    public final int f38751a;
    public final rr0 f38752b;
    public final String f38753c;

    public qr0(rr0 rr0Var, String str, int i7) {
        this.f38751a = i7;
        this.f38752b = rr0Var;
        this.f38753c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f38751a) {
            case 0:
                rr0 rr0Var = this.f38752b;
                String str = this.f38753c;
                rr0Var.getClass();
                org.telegram.messenger.g0.h3(new qr0(rr0Var, str, 1));
                return;
            default:
                rr0 rr0Var2 = this.f38752b;
                String str2 = this.f38753c;
                ArrayList arrayList = null;
                rr0Var2.f39047f = null;
                if (!org.telegram.messenger.t3.T(rr0Var2.f39048n) && rr0Var2.f39050s.f42100g1 != null) {
                    arrayList = new ArrayList(rr0Var2.f39050s.f42100g1.participants.participants);
                }
                rr0Var2.f39049r = 2;
                if (arrayList != null) {
                    Utilities.f22418g.c(new yf(rr0Var2, str2, arrayList, 24));
                } else {
                    rr0Var2.f39049r = 1;
                }
                jg.z1 z1Var = rr0Var2.f39046e;
                if (org.telegram.messenger.t3.T(rr0Var2.f39048n)) {
                    j3 = rr0Var2.f39048n.f28051id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
