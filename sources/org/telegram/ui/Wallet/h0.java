package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.fe0;
public final class h0 implements Runnable, gs {
    public boolean f44327a;
    public final ls f44328b;
    public final fe0 f44329c;
    public final u0 d;

    public h0(ls lsVar, fe0 fe0Var, u0 u0Var) {
        this.f44328b = lsVar;
        this.f44329c = fe0Var;
        this.d = u0Var;
    }

    public final void a() {
        if (!this.f44327a) {
            u0 u0Var = this.d;
            if (u0Var.f45130e != null) {
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
        if (i7 == ls.f25296d4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f44327a) {
            return;
        }
        this.f44327a = true;
        org.telegram.messenger.g0.r(this);
        this.f44328b.n(this, ls.f25296d4);
        this.f44329c.run();
    }
}
