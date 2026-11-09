package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.p61;
public final class g2 implements Runnable {
    public final int f27492a;
    public final v2 f27493b;

    public g2(v2 v2Var, int i7) {
        this.f27492a = i7;
        this.f27493b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f27492a) {
            case 0:
                v2 v2Var = this.f27493b;
                l2 l2Var = v2Var.f28627c;
                org.telegram.messenger.g0.E2(l2Var);
                v2Var.f28637f1.getLayoutContainer().addView(l2Var);
                return;
            case 1:
                this.f27493b.dismiss();
                return;
            case 2:
                try {
                    this.f27493b.K();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f27493b.dismiss();
                qs.f(p10.f24470s0).k(189, new Object[0]);
                org.telegram.messenger.g0.i3(new p61(21), 220L);
                return;
        }
    }
}
