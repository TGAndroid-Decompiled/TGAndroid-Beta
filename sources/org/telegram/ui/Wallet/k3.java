package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;
public final class k3 implements Runnable {
    public final int f42701a;
    public final org.telegram.ui.ActionBar.f2 f42702b;

    public k3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f42701a = i7;
        this.f42702b = f2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42701a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f42702b;
        switch (i7) {
            case 0:
                y5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                return;
            case 1:
                f2Var.presentFragment(new y5());
                return;
            default:
                if (hc.a(f2Var)) {
                    hc.a0(f2Var).I(2131623989, hd.M0(2131743151, null), hd.M0(2131743150, null)).j();
                    return;
                }
                return;
        }
    }
}
