package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.ui.cd0;
public final class h2 implements Runnable {
    public final int f28993a;
    public final w2 f28994b;

    public h2(w2 w2Var, int i7) {
        this.f28993a = i7;
        this.f28994b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f28993a) {
            case 0:
                w2 w2Var = this.f28994b;
                m2 m2Var = w2Var.f30176c;
                org.telegram.messenger.g0.E2(m2Var);
                w2Var.f30194j1.getLayoutContainer().addView(m2Var);
                return;
            case 1:
                this.f28994b.dismiss();
                return;
            case 2:
                try {
                    this.f28994b.L();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f28994b.dismiss();
                ks.f(j10.f24798t0).k(191, new Object[0]);
                org.telegram.messenger.g0.h3(new cd0(28), 220L);
                return;
        }
    }
}
