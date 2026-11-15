package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.ui.ah0;
public final class f2 implements Runnable {
    public final int f28525a;
    public final u2 f28526b;

    public f2(u2 u2Var, int i7) {
        this.f28525a = i7;
        this.f28526b = u2Var;
    }

    @Override
    public final void run() {
        switch (this.f28525a) {
            case 0:
                u2 u2Var = this.f28526b;
                k2 k2Var = u2Var.f29685c;
                org.telegram.messenger.g0.E2(k2Var);
                u2Var.f29703j1.getLayoutContainer().addView(k2Var);
                return;
            case 1:
                this.f28526b.dismiss();
                return;
            case 2:
                try {
                    this.f28526b.L();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f28526b.dismiss();
                ns.f(m10.f24940t0).k(189, new Object[0]);
                org.telegram.messenger.g0.i3(new ah0(25), 220L);
                return;
        }
    }
}
