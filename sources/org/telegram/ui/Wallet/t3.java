package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.lc;
public final class t3 implements Runnable {
    public final int f45074a;
    public final org.telegram.ui.ActionBar.g2 f45075b;

    public t3(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f45074a = i7;
        this.f45075b = g2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45074a;
        org.telegram.ui.ActionBar.g2 g2Var = this.f45075b;
        switch (i7) {
            case 0:
                g2Var.presentFragment(new n6());
                return;
            case 1:
                n6.M0(g2Var.getContext(), g2Var.getResourceProvider());
                return;
            default:
                if (lc.a(g2Var)) {
                    lc.b0(g2Var).I(2131623990, hd.N0(2131742906, null), hd.N0(2131742905, null)).j();
                    return;
                }
                return;
        }
    }
}
