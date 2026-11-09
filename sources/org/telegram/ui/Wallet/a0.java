package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.bd0;
public final class a0 implements Runnable, ls {
    public boolean f42092a;
    public final qs f42093b;
    public final bd0 f42094c;
    public final l0 d;

    public a0(qs qsVar, bd0 bd0Var, l0 l0Var) {
        this.f42093b = qsVar;
        this.f42094c = bd0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f42092a) {
            l0 l0Var = this.d;
            if (l0Var.f42683e != null) {
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
        if (i7 == qs.f24971a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f42092a) {
            return;
        }
        this.f42092a = true;
        org.telegram.messenger.g0.r(this);
        this.f42093b.n(this, qs.f24971a4);
        this.f42094c.run();
    }
}
