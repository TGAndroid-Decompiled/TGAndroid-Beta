package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.kc;
public final class u3 implements Runnable {
    public final int f45236a;
    public final org.telegram.ui.ActionBar.g2 f45237b;

    public u3(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f45236a = i7;
        this.f45237b = g2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45236a;
        org.telegram.ui.ActionBar.g2 g2Var = this.f45237b;
        switch (i7) {
            case 0:
                g2Var.presentFragment(new o6());
                return;
            case 1:
                o6.M0(g2Var.getContext(), g2Var.getResourceProvider());
                return;
            default:
                if (kc.a(g2Var)) {
                    kc.b0(g2Var).I(2131623990, gd.N0(2131742899, null), gd.N0(2131742898, null)).j();
                    return;
                }
                return;
        }
    }
}
