package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;
public final class z8 implements c20 {
    public final int f43462a;
    public final l9 f43463b;

    public z8(l9 l9Var, int i7) {
        this.f43462a = i7;
        this.f43463b = l9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43462a) {
            case 0:
                l9.f0(this.f43463b, (String) obj);
                return;
            case 1:
                this.f43463b.f42750q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f43463b.f42750q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f43463b.f42750q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
