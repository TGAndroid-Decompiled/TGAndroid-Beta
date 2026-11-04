package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.Components.fc;
public final class i3 implements Runnable {
    public final int f42648a;
    public final org.telegram.ui.ActionBar.d2 f42649b;

    public i3(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f42648a = i3;
        this.f42649b = d2Var;
    }

    @Override
    public final void run() {
        int i3 = this.f42648a;
        org.telegram.ui.ActionBar.d2 d2Var = this.f42649b;
        switch (i3) {
            case 0:
                w5.I0(d2Var.getContext(), d2Var.getResourceProvider());
                return;
            case 1:
                d2Var.presentFragment(new w5());
                return;
            default:
                if (fc.a(d2Var)) {
                    fc.a0(d2Var).I(2131623989, bd.M0(2131743160, null), bd.M0(2131743159, null)).j();
                    return;
                }
                return;
        }
    }
}
