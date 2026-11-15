package org.telegram.ui.Wallet;

import org.telegram.tgnet.tl.TL_wallet;
public final class j3 implements Runnable {
    public final int f44007a;
    public final org.telegram.ui.ActionBar.e2 f44008b;
    public final TL_wallet.card f44009c;

    public j3(org.telegram.ui.ActionBar.e2 e2Var, TL_wallet.card cardVar, int i7) {
        this.f44007a = i7;
        this.f44008b = e2Var;
        this.f44009c = cardVar;
    }

    @Override
    public final void run() {
        switch (this.f44007a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.f44008b;
                e2Var.presentFragment(new p9(e2Var.getCurrentAccount(), this.f44009c.address));
                return;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f44008b;
                e2Var2.presentFragment(new p9(e2Var2.getCurrentAccount(), this.f44009c.address));
                return;
        }
    }
}
