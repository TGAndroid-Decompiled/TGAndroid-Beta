package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class w7 implements Utilities.Callback {
    public final int f35690a;
    public final k8 f35691b;

    public w7(k8 k8Var, int i10) {
        this.f35690a = i10;
        this.f35691b = k8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35690a) {
            case 0:
                k8.a0(this.f35691b, (String) obj);
                return;
            case 1:
                this.f35691b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35691b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35691b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
