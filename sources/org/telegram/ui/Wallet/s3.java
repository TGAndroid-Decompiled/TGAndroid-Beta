package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class s3 implements Runnable {
    public final int f45046a;
    public final org.telegram.ui.ActionBar.g2 f45047b;
    public final TL_wallet.card f45048c;

    public s3(org.telegram.ui.ActionBar.g2 g2Var, TL_wallet.card cardVar, int i7) {
        this.f45046a = i7;
        this.f45047b = g2Var;
        this.f45048c = cardVar;
    }

    @Override
    public final void run() {
        switch (this.f45046a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.f45047b;
                g2Var.presentFragment(new ea(g2Var.getCurrentAccount(), this.f45048c.address));
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f45047b;
                g2Var2.presentFragment(new ea(g2Var2.getCurrentAccount(), this.f45048c.address));
                return;
        }
    }
}
