package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class i3 implements Runnable {
    public final int f42590a;
    public final org.telegram.ui.ActionBar.f2 f42591b;

    public i3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f42590a = i7;
        this.f42591b = f2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42590a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f42591b;
        switch (i7) {
            case 0:
                w5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                return;
            case 1:
                f2Var.presentFragment(new w5());
                return;
            default:
                if (hc.a(f2Var)) {
                    hc.a0(f2Var).I(2131623989, id.M0(2131743150, null), id.M0(2131743149, null)).j();
                    return;
                }
                return;
        }
    }
}
