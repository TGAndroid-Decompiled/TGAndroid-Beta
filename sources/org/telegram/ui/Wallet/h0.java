package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.o60;
public final class h0 implements Runnable, gs {
    public boolean f44293a;
    public final ls f44294b;
    public final o60 f44295c;
    public final u0 d;

    public h0(ls lsVar, o60 o60Var, u0 u0Var) {
        this.f44294b = lsVar;
        this.f44295c = o60Var;
        this.d = u0Var;
    }

    public final void a() {
        if (!this.f44293a) {
            u0 u0Var = this.d;
            if (u0Var.f45096e != null) {
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
        if (i7 == ls.f25260d4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f44293a) {
            return;
        }
        this.f44293a = true;
        org.telegram.messenger.g0.r(this);
        this.f44294b.n(this, ls.f25260d4);
        this.f44295c.run();
    }
}
