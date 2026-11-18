package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.n60;
public final class h0 implements Runnable, fs {
    public boolean f44283a;
    public final ks f44284b;
    public final n60 f44285c;
    public final u0 d;

    public h0(ks ksVar, n60 n60Var, u0 u0Var) {
        this.f44284b = ksVar;
        this.f44285c = n60Var;
        this.d = u0Var;
    }

    public final void a() {
        if (!this.f44283a) {
            u0 u0Var = this.d;
            if (u0Var.f45086e != null) {
                ArrayList arrayList = u0Var.J;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((q0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25099c4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f44283a) {
            return;
        }
        this.f44283a = true;
        org.telegram.messenger.g0.r(this);
        this.f44284b.n(this, ks.f25099c4);
        this.f44285c.run();
    }
}
