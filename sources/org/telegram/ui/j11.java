package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class j11 implements Runnable {
    public final int f38253a;
    public final g31 f38254b;

    public j11(g31 g31Var, int i10) {
        this.f38253a = i10;
        this.f38254b = g31Var;
    }

    @Override
    public final void run() {
        switch (this.f38253a) {
            case 0:
                g31 g31Var = this.f38254b;
                g31Var.getClass();
                HashSet hashSet = sg.e0.f48330a;
                com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.ic.D().f16258p;
                if (((CountDownLatch) c0Var.f4586c) == null) {
                    c0Var.f4586c = new CountDownLatch(1);
                }
                sg.e0.f48331b = true;
                sg.e0.e = false;
                sg.e0.f48334g = false;
                org.telegram.messenger.i0.h3(new j11(g31Var, 2), 0L);
                return;
            case 1:
                g31 g31Var2 = this.f38254b;
                ArrayList arrayList = g31Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = g31Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = g31Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                g31Var2.f37322q0.E(true);
                return;
            case 2:
                this.f38254b.V1.start();
                return;
            case 3:
                this.f38254b.B(true, true, true);
                return;
            default:
                g31 g31Var3 = this.f38254b;
                org.telegram.messenger.at e = org.telegram.messenger.at.e();
                j11 j11Var = g31Var3.S1;
                e.e.remove(j11Var);
                org.telegram.messenger.at.e().d(j11Var);
                return;
        }
    }
}
