package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.ui.hb1;
public final class e2 implements Runnable {
    public final int f27471a;
    public final t2 f27472b;

    public e2(t2 t2Var, int i3) {
        this.f27471a = i3;
        this.f27472b = t2Var;
    }

    @Override
    public final void run() {
        switch (this.f27471a) {
            case 0:
                t2 t2Var = this.f27472b;
                j2 j2Var = t2Var.f28589c;
                org.telegram.messenger.g0.E2(j2Var);
                t2Var.f28601g1.getLayoutContainer().addView(j2Var);
                return;
            case 1:
                this.f27472b.dismiss();
                return;
            case 2:
                try {
                    this.f27472b.K();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f27472b.dismiss();
                hs.f(h10.f22829t0).k(189, new Object[0]);
                org.telegram.messenger.g0.i3(new hb1(19), 220L);
                return;
        }
    }
}
