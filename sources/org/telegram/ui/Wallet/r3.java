package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class r3 implements Runnable {
    public final int f44918a;
    public final org.telegram.ui.ActionBar.g2 f44919b;
    public final TL_wallet.card f44920c;

    public r3(org.telegram.ui.ActionBar.g2 g2Var, TL_wallet.card cardVar, int i7) {
        this.f44918a = i7;
        this.f44919b = g2Var;
        this.f44920c = cardVar;
    }

    @Override
    public final void run() {
        switch (this.f44918a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.f44919b;
                g2Var.presentFragment(new da(g2Var.getCurrentAccount(), this.f44920c.address));
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f44919b;
                g2Var2.presentFragment(new da(g2Var2.getCurrentAccount(), this.f44920c.address));
                return;
        }
    }
}
