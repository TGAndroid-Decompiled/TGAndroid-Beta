package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.ui.cd0;
public final class h2 implements Runnable {
    public final int f28962a;
    public final w2 f28963b;

    public h2(w2 w2Var, int i7) {
        this.f28962a = i7;
        this.f28963b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f28962a) {
            case 0:
                w2 w2Var = this.f28963b;
                m2 m2Var = w2Var.f30145c;
                org.telegram.messenger.g0.E2(m2Var);
                w2Var.f30163j1.getLayoutContainer().addView(m2Var);
                return;
            case 1:
                this.f28963b.dismiss();
                return;
            case 2:
                try {
                    this.f28963b.L();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f28963b.dismiss();
                ls.f(k10.f24932t0).k(191, new Object[0]);
                org.telegram.messenger.g0.h3(new cd0(28), 220L);
                return;
        }
    }
}
