package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;
public final class l3 implements Runnable {
    public final int f44117a;
    public final org.telegram.ui.ActionBar.e2 f44118b;

    public l3(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f44117a = i7;
        this.f44118b = e2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44117a;
        org.telegram.ui.ActionBar.e2 e2Var = this.f44118b;
        switch (i7) {
            case 0:
                e2Var.presentFragment(new y5());
                return;
            case 1:
                y5.I0(e2Var.getContext(), e2Var.getResourceProvider());
                return;
            default:
                if (cc.a(e2Var)) {
                    cc.a0(e2Var).I(2131623990, hd.M0(2131743150, null), hd.M0(2131743149, null)).j();
                    return;
                }
                return;
        }
    }
}
