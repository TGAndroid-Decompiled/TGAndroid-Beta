package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pr0 implements Runnable {
    public final int f37038a;
    public final qr0 f37039b;
    public final String f37040c;

    public pr0(qr0 qr0Var, String str, int i7) {
        this.f37038a = i7;
        this.f37039b = qr0Var;
        this.f37040c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f37038a) {
            case 0:
                qr0 qr0Var = this.f37039b;
                String str = this.f37040c;
                qr0Var.getClass();
                org.telegram.messenger.g0.h3(new pr0(qr0Var, str, 1));
                return;
            default:
                qr0 qr0Var2 = this.f37039b;
                String str2 = this.f37040c;
                ArrayList arrayList = null;
                qr0Var2.f37387f = null;
                if (!org.telegram.messenger.t3.T(qr0Var2.f37388n) && qr0Var2.f37390s.f40373f1 != null) {
                    arrayList = new ArrayList(qr0Var2.f37390s.f40373f1.participants.participants);
                }
                qr0Var2.f37389r = 2;
                if (arrayList != null) {
                    Utilities.f21335g.c(new ng(qr0Var2, str2, arrayList, 22));
                } else {
                    qr0Var2.f37389r = 1;
                }
                jg.z1 z1Var = qr0Var2.f37386e;
                if (org.telegram.messenger.t3.T(qr0Var2.f37388n)) {
                    j3 = qr0Var2.f37388n.f26952id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
