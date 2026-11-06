package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pr0 implements Runnable {
    public final int f37054a;
    public final qr0 f37055b;
    public final String f37056c;

    public pr0(qr0 qr0Var, String str, int i7) {
        this.f37054a = i7;
        this.f37055b = qr0Var;
        this.f37056c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f37054a) {
            case 0:
                qr0 qr0Var = this.f37055b;
                String str = this.f37056c;
                qr0Var.getClass();
                org.telegram.messenger.g0.h3(new pr0(qr0Var, str, 1));
                return;
            default:
                qr0 qr0Var2 = this.f37055b;
                String str2 = this.f37056c;
                ArrayList arrayList = null;
                qr0Var2.f37382f = null;
                if (!org.telegram.messenger.t3.T(qr0Var2.f37383n) && qr0Var2.f37385s.f40389f1 != null) {
                    arrayList = new ArrayList(qr0Var2.f37385s.f40389f1.participants.participants);
                }
                qr0Var2.f37384r = 2;
                if (arrayList != null) {
                    Utilities.f21335g.c(new ng(qr0Var2, str2, arrayList, 22));
                } else {
                    qr0Var2.f37384r = 1;
                }
                jg.z1 z1Var = qr0Var2.f37381e;
                if (org.telegram.messenger.t3.T(qr0Var2.f37383n)) {
                    j3 = qr0Var2.f37383n.f26953id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
