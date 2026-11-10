package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qr0 implements Runnable {
    public final int f37378a;
    public final rr0 f37379b;
    public final String f37380c;

    public qr0(rr0 rr0Var, String str, int i7) {
        this.f37378a = i7;
        this.f37379b = rr0Var;
        this.f37380c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f37378a) {
            case 0:
                rr0 rr0Var = this.f37379b;
                String str = this.f37380c;
                rr0Var.getClass();
                org.telegram.messenger.g0.h3(new qr0(rr0Var, str, 1));
                return;
            default:
                rr0 rr0Var2 = this.f37379b;
                String str2 = this.f37380c;
                ArrayList arrayList = null;
                rr0Var2.f37727f = null;
                if (!org.telegram.messenger.t3.T(rr0Var2.f37728n) && rr0Var2.f37730s.f40668f1 != null) {
                    arrayList = new ArrayList(rr0Var2.f37730s.f40668f1.participants.participants);
                }
                rr0Var2.f37729r = 2;
                if (arrayList != null) {
                    Utilities.f21343g.c(new mg(rr0Var2, str2, arrayList, 22));
                } else {
                    rr0Var2.f37729r = 1;
                }
                jg.z1 z1Var = rr0Var2.f37726e;
                if (org.telegram.messenger.t3.T(rr0Var2.f37728n)) {
                    j3 = rr0Var2.f37728n.f26960id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
