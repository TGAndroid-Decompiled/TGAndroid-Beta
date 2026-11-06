package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
public final class g2 implements Runnable {
    public final int f27486a;
    public final v2 f27487b;

    public g2(v2 v2Var, int i7) {
        this.f27486a = i7;
        this.f27487b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f27486a) {
            case 0:
                v2 v2Var = this.f27487b;
                l2 l2Var = v2Var.f28618c;
                org.telegram.messenger.g0.E2(l2Var);
                v2Var.f28628f1.getLayoutContainer().addView(l2Var);
                return;
            case 1:
                this.f27487b.dismiss();
                return;
            case 2:
                try {
                    this.f27487b.K();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.f27487b.dismiss();
                qs.f(p10.f24459s0).k(189, new Object[0]);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.z(18), 220L);
                return;
        }
    }
}
