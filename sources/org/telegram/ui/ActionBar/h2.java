package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.ui.cd0;
public final class h2 implements Runnable {
    public final int f28996a;
    public final w2 f28997b;

    public h2(w2 w2Var, int i7) {
        this.f28996a = i7;
        this.f28997b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f28996a) {
            case 0:
                w2 w2Var = this.f28997b;
                m2 m2Var = w2Var.f30179c;
                org.telegram.messenger.g0.E2(m2Var);
                w2Var.f30197j1.getLayoutContainer().addView(m2Var);
                return;
            case 1:
                this.f28997b.dismiss();
                return;
            case 2:
                try {
                    this.f28997b.L();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f28997b.dismiss();
                ls.f(k10.f24968t0).k(191, new Object[0]);
                org.telegram.messenger.g0.h3(new cd0(28), 220L);
                return;
        }
    }
}
