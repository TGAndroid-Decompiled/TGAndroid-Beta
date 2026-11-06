package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.zc0;
public final class c0 implements Runnable, ls {
    public boolean f42206a;
    public final qs f42207b;
    public final zc0 f42208c;
    public final n0 d;

    public c0(qs qsVar, zc0 zc0Var, n0 n0Var) {
        this.f42207b = qsVar;
        this.f42208c = zc0Var;
        this.d = n0Var;
    }

    public final void a() {
        if (!this.f42206a) {
            n0 n0Var = this.d;
            if (n0Var.f42795e != null) {
                ArrayList arrayList = n0Var.G;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((j0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24962a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f42206a) {
            return;
        }
        this.f42206a = true;
        org.telegram.messenger.g0.r(this);
        this.f42207b.n(this, qs.f24962a4);
        this.f42208c.run();
    }
}
