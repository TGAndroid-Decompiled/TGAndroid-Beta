package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
public final class k3 implements Runnable {
    public final int f34812a;
    public final org.telegram.ui.ActionBar.k2 f34813b;

    public k3(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f34812a = i10;
        this.f34813b = k2Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34812a;
        org.telegram.ui.ActionBar.k2 k2Var = this.f34813b;
        switch (i10) {
            case 0:
                b6.I0(k2Var.getContext(), k2Var.getResourceProvider());
                return;
            case 1:
                k2Var.presentFragment(new b6());
                return;
            default:
                if (cc.a(k2Var)) {
                    cc.a0(k2Var).I(2131623989, dd.L0(2131743176, null), dd.L0(2131743175, null)).j();
                    return;
                }
                return;
        }
    }
}
