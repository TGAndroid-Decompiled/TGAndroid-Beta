package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v7 implements Utilities.Callback {
    public final int f35596a;
    public final j8 f35597b;

    public v7(j8 j8Var, int i10) {
        this.f35596a = i10;
        this.f35597b = j8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35596a) {
            case 0:
                j8.a0(this.f35597b, (String) obj);
                return;
            case 1:
                this.f35597b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35597b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35597b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
