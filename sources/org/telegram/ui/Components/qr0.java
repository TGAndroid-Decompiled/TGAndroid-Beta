package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qr0 implements Runnable {
    public final int f38753a;
    public final rr0 f38754b;
    public final String f38755c;

    public qr0(rr0 rr0Var, String str, int i7) {
        this.f38753a = i7;
        this.f38754b = rr0Var;
        this.f38755c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f38753a) {
            case 0:
                rr0 rr0Var = this.f38754b;
                String str = this.f38755c;
                rr0Var.getClass();
                org.telegram.messenger.g0.h3(new qr0(rr0Var, str, 1));
                return;
            default:
                rr0 rr0Var2 = this.f38754b;
                String str2 = this.f38755c;
                ArrayList arrayList = null;
                rr0Var2.f39050f = null;
                if (!org.telegram.messenger.t3.T(rr0Var2.f39051n) && rr0Var2.f39053s.f42098g1 != null) {
                    arrayList = new ArrayList(rr0Var2.f39053s.f42098g1.participants.participants);
                }
                rr0Var2.f39052r = 2;
                if (arrayList != null) {
                    Utilities.f22418g.c(new yf(rr0Var2, str2, arrayList, 24));
                } else {
                    rr0Var2.f39052r = 1;
                }
                jg.z1 z1Var = rr0Var2.f39049e;
                if (org.telegram.messenger.t3.T(rr0Var2.f39051n)) {
                    j3 = rr0Var2.f39051n.f28051id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
