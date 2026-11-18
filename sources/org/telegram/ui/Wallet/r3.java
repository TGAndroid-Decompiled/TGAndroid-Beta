package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class r3 implements Runnable {
    public final int f44874a;
    public final org.telegram.ui.ActionBar.h2 f44875b;
    public final TL_wallet.card f44876c;

    public r3(org.telegram.ui.ActionBar.h2 h2Var, TL_wallet.card cardVar, int i7) {
        this.f44874a = i7;
        this.f44875b = h2Var;
        this.f44876c = cardVar;
    }

    @Override
    public final void run() {
        switch (this.f44874a) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = this.f44875b;
                h2Var.presentFragment(new da(h2Var.getCurrentAccount(), this.f44876c.address));
                return;
            default:
                org.telegram.ui.ActionBar.h2 h2Var2 = this.f44875b;
                h2Var2.presentFragment(new da(h2Var2.getCurrentAccount(), this.f44876c.address));
                return;
        }
    }
}
