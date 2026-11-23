package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.bd0;
public final class i0 implements Runnable, fs {
    public boolean f44455a;
    public final ks f44456b;
    public final bd0 f44457c;
    public final v0 d;

    public i0(ks ksVar, bd0 bd0Var, v0 v0Var) {
        this.f44456b = ksVar;
        this.f44457c = bd0Var;
        this.d = v0Var;
    }

    public final void a() {
        if (!this.f44455a) {
            v0 v0Var = this.d;
            if (v0Var.f45258e != null) {
                ArrayList arrayList = v0Var.J;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((r0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25201d4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f44455a) {
            return;
        }
        this.f44455a = true;
        org.telegram.messenger.g0.r(this);
        this.f44456b.n(this, ks.f25201d4);
        this.f44457c.run();
    }
}
