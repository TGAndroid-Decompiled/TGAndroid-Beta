package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.o61;
public final class g2 implements Runnable {
    public final int f27490a;
    public final v2 f27491b;

    public g2(v2 v2Var, int i7) {
        this.f27490a = i7;
        this.f27491b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f27490a) {
            case 0:
                v2 v2Var = this.f27491b;
                l2 l2Var = v2Var.f28622c;
                org.telegram.messenger.g0.E2(l2Var);
                v2Var.f28632f1.getLayoutContainer().addView(l2Var);
                return;
            case 1:
                this.f27491b.dismiss();
                return;
            case 2:
                try {
                    this.f27491b.K();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f27491b.dismiss();
                qs.f(p10.f24470s0).k(189, new Object[0]);
                org.telegram.messenger.g0.i3(new o61(21), 220L);
                return;
        }
    }
}
