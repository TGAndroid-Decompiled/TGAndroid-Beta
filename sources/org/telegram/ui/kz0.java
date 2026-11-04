package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class kz0 implements Runnable {
    public final int f47055a;
    public final g11 f47056b;

    public kz0(g11 g11Var, int i3) {
        this.f47055a = i3;
        this.f47056b = g11Var;
    }

    @Override
    public final void run() {
        switch (this.f47055a) {
            case 0:
                g11 g11Var = this.f47056b;
                g11Var.getClass();
                HashSet hashSet = dh.d0.f8982a;
                com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.zb.D().f26770p;
                if (((CountDownLatch) c0Var.f6883c) == null) {
                    c0Var.f6883c = new CountDownLatch(1);
                }
                dh.d0.f8983b = true;
                dh.d0.f8985e = false;
                dh.d0.f8987g = false;
                org.telegram.messenger.g0.i3(new kz0(g11Var, 2), 0L);
                return;
            case 1:
                g11 g11Var2 = this.f47056b;
                ArrayList arrayList = g11Var2.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = g11Var2.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = g11Var2.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g11Var2.f45473r0.E(true);
                return;
            case 2:
                this.f47056b.W1.start();
                return;
            case 3:
                this.f47056b.B(true, true, true);
                return;
            default:
                g11 g11Var3 = this.f47056b;
                org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                kz0 kz0Var = g11Var3.T1;
                e10.f23356e.remove(kz0Var);
                org.telegram.messenger.hs.e().d(kz0Var);
                return;
        }
    }
}
