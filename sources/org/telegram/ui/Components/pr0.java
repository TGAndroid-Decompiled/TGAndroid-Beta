package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pr0 implements Runnable {
    public final int f37159a;
    public final qr0 f37160b;
    public final String f37161c;

    public pr0(qr0 qr0Var, String str, int i7) {
        this.f37159a = i7;
        this.f37160b = qr0Var;
        this.f37161c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f37159a) {
            case 0:
                qr0 qr0Var = this.f37160b;
                String str = this.f37161c;
                qr0Var.getClass();
                org.telegram.messenger.g0.h3(new pr0(qr0Var, str, 1));
                return;
            default:
                qr0 qr0Var2 = this.f37160b;
                String str2 = this.f37161c;
                ArrayList arrayList = null;
                qr0Var2.f37497f = null;
                if (!org.telegram.messenger.t3.T(qr0Var2.f37498n) && qr0Var2.f37500s.f40354f1 != null) {
                    arrayList = new ArrayList(qr0Var2.f37500s.f40354f1.participants.participants);
                }
                qr0Var2.f37499r = 2;
                if (arrayList != null) {
                    Utilities.f21335g.c(new ng(qr0Var2, str2, arrayList, 22));
                } else {
                    qr0Var2.f37499r = 1;
                }
                jg.z1 z1Var = qr0Var2.f37496e;
                if (org.telegram.messenger.t3.T(qr0Var2.f37498n)) {
                    j3 = qr0Var2.f37498n.f26952id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
