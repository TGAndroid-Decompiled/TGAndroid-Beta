package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.fe0;
public final class h0 implements Runnable, fs {
    public boolean f44323a;
    public final ks f44324b;
    public final fe0 f44325c;
    public final u0 d;

    public h0(ks ksVar, fe0 fe0Var, u0 u0Var) {
        this.f44324b = ksVar;
        this.f44325c = fe0Var;
        this.d = u0Var;
    }

    public final void a() {
        if (!this.f44323a) {
            u0 u0Var = this.d;
            if (u0Var.f45126e != null) {
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
        if (i7 == ks.f25130d4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f44323a) {
            return;
        }
        this.f44323a = true;
        org.telegram.messenger.g0.r(this);
        this.f44324b.n(this, ks.f25130d4);
        this.f44325c.run();
    }
}
