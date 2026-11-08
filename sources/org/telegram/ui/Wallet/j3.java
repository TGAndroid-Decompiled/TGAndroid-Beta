package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class j3 implements Runnable {
    public final int f42672a;
    public final org.telegram.ui.ActionBar.f2 f42673b;

    public j3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f42672a = i7;
        this.f42673b = f2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42672a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f42673b;
        switch (i7) {
            case 0:
                x5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                return;
            case 1:
                f2Var.presentFragment(new x5());
                return;
            default:
                if (hc.a(f2Var)) {
                    hc.a0(f2Var).I(2131623989, id.M0(2131743153, null), id.M0(2131743152, null)).j();
                    return;
                }
                return;
        }
    }
}
