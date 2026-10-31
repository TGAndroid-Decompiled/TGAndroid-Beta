package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
public final class k11 implements Runnable {
    public final int f38668a;
    public final i31 f38669b;

    public k11(i31 i31Var, int i10) {
        this.f38668a = i10;
        this.f38669b = i31Var;
    }

    @Override
    public final void run() {
        switch (this.f38668a) {
            case 0:
                i31 i31Var = this.f38669b;
                i31Var.getClass();
                HashSet hashSet = sg.e0.f48319a;
                com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.hc.D().f15865p;
                if (((CountDownLatch) c0Var.f4586c) == null) {
                    c0Var.f4586c = new CountDownLatch(1);
                }
                sg.e0.f48320b = true;
                sg.e0.e = false;
                sg.e0.f48323g = false;
                org.telegram.messenger.i0.h3(new k11(i31Var, 2), 0L);
                return;
            case 1:
                i31 i31Var2 = this.f38669b;
                ArrayList arrayList = i31Var2.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = i31Var2.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = i31Var2.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                i31Var2.f38146q0.E(true);
                return;
            case 2:
                this.f38669b.V1.start();
                return;
            case 3:
                this.f38669b.B(true, true, true);
                return;
            default:
                i31 i31Var3 = this.f38669b;
                org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
                k11 k11Var = i31Var3.S1;
                e.e.remove(k11Var);
                org.telegram.messenger.zs.e().d(k11Var);
                return;
        }
    }
}
