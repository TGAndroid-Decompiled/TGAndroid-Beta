package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
public final class j3 implements Runnable {
    public final int f34749a;
    public final org.telegram.ui.ActionBar.k2 f34750b;

    public j3(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f34749a = i10;
        this.f34750b = k2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34749a;
        org.telegram.ui.ActionBar.k2 k2Var = this.f34750b;
        switch (i10) {
            case 0:
                b6.H0(k2Var.getContext(), k2Var.getResourceProvider());
                return;
            case 1:
                k2Var.presentFragment(new b6());
                return;
            default:
                if (cc.a(k2Var)) {
                    cc.a0(k2Var).I(2131623989, cd.L0(2131743176, null), cd.L0(2131743175, null)).j();
                    return;
                }
                return;
        }
    }
}
