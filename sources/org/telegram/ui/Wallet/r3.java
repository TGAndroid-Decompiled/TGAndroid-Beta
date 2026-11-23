package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class r3 implements Runnable {
    public final int f44884a;
    public final org.telegram.ui.ActionBar.g2 f44885b;
    public final TL_wallet.card f44886c;

    public r3(org.telegram.ui.ActionBar.g2 g2Var, TL_wallet.card cardVar, int i7) {
        this.f44884a = i7;
        this.f44885b = g2Var;
        this.f44886c = cardVar;
    }

    @Override
    public final void run() {
        switch (this.f44884a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.f44885b;
                g2Var.presentFragment(new da(g2Var.getCurrentAccount(), this.f44886c.address));
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f44885b;
                g2Var2.presentFragment(new da(g2Var2.getCurrentAccount(), this.f44886c.address));
                return;
        }
    }
}
