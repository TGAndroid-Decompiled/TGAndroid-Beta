package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v7 implements Utilities.Callback {
    public final int f33527a;
    public final j8 f33528b;

    public v7(j8 j8Var, int i10) {
        this.f33527a = i10;
        this.f33528b = j8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33527a) {
            case 0:
                j8.a0(this.f33528b, (String) obj);
                return;
            case 1:
                this.f33528b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f33528b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f33528b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
