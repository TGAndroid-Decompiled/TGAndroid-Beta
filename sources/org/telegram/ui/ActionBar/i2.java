package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.ui.dd0;
public final class i2 implements Runnable {
    public final int f29009a;
    public final x2 f29010b;

    public i2(x2 x2Var, int i7) {
        this.f29009a = i7;
        this.f29010b = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f29009a) {
            case 0:
                x2 x2Var = this.f29010b;
                n2 n2Var = x2Var.f30193c;
                org.telegram.messenger.g0.E2(n2Var);
                x2Var.f30211j1.getLayoutContainer().addView(n2Var);
                return;
            case 1:
                this.f29010b.dismiss();
                return;
            case 2:
                try {
                    this.f29010b.L();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f29010b.dismiss();
                ks.f(j10.f24770t0).k(191, new Object[0]);
                org.telegram.messenger.g0.h3(new dd0(28), 220L);
                return;
        }
    }
}
