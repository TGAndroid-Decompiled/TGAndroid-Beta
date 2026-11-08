package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.zc0;
public final class b0 implements Runnable, ls {
    public boolean f42172a;
    public final qs f42173b;
    public final zc0 f42174c;
    public final m0 d;

    public b0(qs qsVar, zc0 zc0Var, m0 m0Var) {
        this.f42173b = qsVar;
        this.f42174c = zc0Var;
        this.d = m0Var;
    }

    public final void a() {
        if (!this.f42172a) {
            m0 m0Var = this.d;
            if (m0Var.f42765e != null) {
                ArrayList arrayList = m0Var.G;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    if (((i0) obj).d) {
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
        if (this.f42172a) {
            return;
        }
        this.f42172a = true;
        org.telegram.messenger.g0.r(this);
        this.f42173b.n(this, qs.f24971a4);
        this.f42174c.run();
    }
}
