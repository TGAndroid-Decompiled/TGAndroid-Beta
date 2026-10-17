package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class y8 implements Utilities.Callback {
    public final int f35183a;
    public final l9 f35184b;

    public y8(l9 l9Var, int i10) {
        this.f35183a = i10;
        this.f35184b = l9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35183a) {
            case 0:
                l9.a0(this.f35184b, (String) obj);
                return;
            case 1:
                this.f35184b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35184b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35184b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
