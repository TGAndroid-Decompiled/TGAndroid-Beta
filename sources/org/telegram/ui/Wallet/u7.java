package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class u7 implements Utilities.Callback {
    public final int f35528a;
    public final i8 f35529b;

    public u7(i8 i8Var, int i10) {
        this.f35528a = i10;
        this.f35529b = i8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35528a) {
            case 0:
                i8.a0(this.f35529b, (String) obj);
                return;
            case 1:
                this.f35529b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35529b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35529b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
