package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.q61;
public final class g2 implements Runnable {
    public final int f27498a;
    public final w2 f27499b;

    public g2(w2 w2Var, int i7) {
        this.f27498a = i7;
        this.f27499b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f27498a) {
            case 0:
                w2 w2Var = this.f27499b;
                m2 m2Var = w2Var.f28675c;
                org.telegram.messenger.g0.E2(m2Var);
                w2Var.f28691i1.getLayoutContainer().addView(m2Var);
                return;
            case 1:
                this.f27499b.dismiss();
                return;
            case 2:
                try {
                    this.f27499b.K();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f27499b.dismiss();
                qs.f(p10.f24474s0).k(189, new Object[0]);
                org.telegram.messenger.g0.i3(new q61(21), 220L);
                return;
        }
    }
}
