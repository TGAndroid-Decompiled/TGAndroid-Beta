package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.ui.cd0;
public final class h2 implements Runnable {
    public final int f29054a;
    public final w2 f29055b;

    public h2(w2 w2Var, int i7) {
        this.f29054a = i7;
        this.f29055b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f29054a) {
            case 0:
                w2 w2Var = this.f29055b;
                m2 m2Var = w2Var.f30229c;
                org.telegram.messenger.g0.E2(m2Var);
                w2Var.f30247j1.getLayoutContainer().addView(m2Var);
                return;
            case 1:
                this.f29055b.dismiss();
                return;
            case 2:
                try {
                    this.f29055b.L();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f29055b.dismiss();
                ks.f(i10.f24637t0).k(191, new Object[0]);
                org.telegram.messenger.g0.h3(new cd0(28), 220L);
                return;
        }
    }
}
