package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.tb0;
public final class z implements Runnable, cs {
    public boolean f43485a;
    public final hs f43486b;
    public final tb0 f43487c;
    public final k0 d;

    public z(hs hsVar, tb0 tb0Var, k0 k0Var) {
        this.f43486b = hsVar;
        this.f43487c = tb0Var;
        this.d = k0Var;
    }

    public final void a() {
        if (!this.f43485a) {
            k0 k0Var = this.d;
            if (k0Var.f42721e != null) {
                ArrayList arrayList = k0Var.G;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (((g0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23200a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f43485a) {
            return;
        }
        this.f43485a = true;
        org.telegram.messenger.g0.r(this);
        this.f43486b.n(this, hs.f23200a4);
        this.f43487c.run();
    }
}
