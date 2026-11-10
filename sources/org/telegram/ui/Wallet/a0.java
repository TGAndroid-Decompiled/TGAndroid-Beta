package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.tc0;
public final class a0 implements Runnable, ls {
    public boolean f42083a;
    public final qs f42084b;
    public final tc0 f42085c;
    public final l0 d;

    public a0(qs qsVar, tc0 tc0Var, l0 l0Var) {
        this.f42084b = qsVar;
        this.f42085c = tc0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f42083a) {
            l0 l0Var = this.d;
            if (l0Var.f42752e != null) {
                ArrayList arrayList = l0Var.G;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((h0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24975a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f42083a) {
            return;
        }
        this.f42083a = true;
        org.telegram.messenger.g0.r(this);
        this.f42084b.n(this, qs.f24975a4);
        this.f42085c.run();
    }
}
