package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class b9 implements Utilities.Callback {
    public final int f34063a;
    public final o9 f34064b;

    public b9(o9 o9Var, int i10) {
        this.f34063a = i10;
        this.f34064b = o9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34063a) {
            case 0:
                o9.a0(this.f34064b, (String) obj);
                return;
            case 1:
                this.f34064b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f34064b.m0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f34064b.m0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
