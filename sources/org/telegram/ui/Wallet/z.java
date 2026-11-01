package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.if0;
public final class z implements Runnable, vs {
    public boolean f35435a;
    public final at f35436b;
    public final if0 f35437c;
    public final k0 d;

    public z(at atVar, if0 if0Var, k0 k0Var) {
        this.f35436b = atVar;
        this.f35437c = if0Var;
        this.d = k0Var;
    }

    public final void a() {
        if (!this.f35435a) {
            k0 k0Var = this.d;
            if (k0Var.e != null) {
                ArrayList arrayList = k0Var.G;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((g0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14678a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f35435a) {
            return;
        }
        this.f35435a = true;
        org.telegram.messenger.i0.r(this);
        this.f35436b.n(this, at.f14678a4);
        this.f35437c.run();
    }
}
