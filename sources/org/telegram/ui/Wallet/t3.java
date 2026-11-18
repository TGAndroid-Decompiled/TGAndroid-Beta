package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;
public final class t3 implements Runnable {
    public final int f45064a;
    public final org.telegram.ui.ActionBar.h2 f45065b;

    public t3(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f45064a = i7;
        this.f45065b = h2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45064a;
        org.telegram.ui.ActionBar.h2 h2Var = this.f45065b;
        switch (i7) {
            case 0:
                h2Var.presentFragment(new n6());
                return;
            case 1:
                n6.M0(h2Var.getContext(), h2Var.getResourceProvider());
                return;
            default:
                if (lc.a(h2Var)) {
                    lc.b0(h2Var).I(2131623990, gd.M0(2131742912, null), gd.M0(2131742911, null)).j();
                    return;
                }
                return;
        }
    }
}
