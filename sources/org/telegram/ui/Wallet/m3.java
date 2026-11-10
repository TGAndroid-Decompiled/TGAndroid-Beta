package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;
public final class m3 implements Runnable {
    public final int f42821a;
    public final org.telegram.ui.ActionBar.f2 f42822b;

    public m3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f42821a = i7;
        this.f42822b = f2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f42821a;
        org.telegram.ui.ActionBar.f2 f2Var = this.f42822b;
        switch (i7) {
            case 0:
                f2Var.presentFragment(new z5());
                return;
            case 1:
                z5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                return;
            default:
                if (gc.a(f2Var)) {
                    gc.a0(f2Var).I(2131623989, id.M0(2131743150, null), id.M0(2131743149, null)).j();
                    return;
                }
                return;
        }
    }
}
