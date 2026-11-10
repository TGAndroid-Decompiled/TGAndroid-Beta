package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class k3 implements Runnable {
    public final int f42711a;
    public final org.telegram.ui.ActionBar.f2 f42712b;
    public final TL_wallet.card f42713c;

    public k3(org.telegram.ui.ActionBar.f2 f2Var, TL_wallet.card cardVar, int i7) {
        this.f42711a = i7;
        this.f42712b = f2Var;
        this.f42713c = cardVar;
    }

    @Override
    public final void run() {
        switch (this.f42711a) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = this.f42712b;
                f2Var.presentFragment(new o9(f2Var.getCurrentAccount(), this.f42713c.address));
                return;
            default:
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f42712b;
                f2Var2.presentFragment(new o9(f2Var2.getCurrentAccount(), this.f42713c.address));
                return;
        }
    }
}
