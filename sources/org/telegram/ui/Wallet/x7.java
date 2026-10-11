package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class x7 implements Utilities.Callback {
    public final int f35754a;
    public final l8 f35755b;

    public x7(l8 l8Var, int i10) {
        this.f35754a = i10;
        this.f35755b = l8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35754a) {
            case 0:
                l8.a0(this.f35755b, (String) obj);
                return;
            case 1:
                this.f35755b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35755b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35755b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
