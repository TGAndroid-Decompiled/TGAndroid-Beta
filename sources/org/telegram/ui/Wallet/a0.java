package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.jd0;
public final class a0 implements Runnable, is {
    public boolean f43459a;
    public final ns f43460b;
    public final jd0 f43461c;
    public final l0 d;

    public a0(ns nsVar, jd0 jd0Var, l0 l0Var) {
        this.f43460b = nsVar;
        this.f43461c = jd0Var;
        this.d = l0Var;
    }

    public final void a() {
        if (!this.f43459a) {
            l0 l0Var = this.d;
            if (l0Var.f44081e != null) {
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
        if (i7 == ns.f25467a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f43459a) {
            return;
        }
        this.f43459a = true;
        org.telegram.messenger.g0.r(this);
        this.f43460b.n(this, ns.f25467a4);
        this.f43461c.run();
    }
}
