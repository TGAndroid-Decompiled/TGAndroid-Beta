package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_wallet;
public final class g9 implements r20 {
    public final int f34608a;
    public final r9 f34609b;

    public g9(r9 r9Var, int i10) {
        this.f34608a = i10;
        this.f34609b = r9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34608a) {
            case 0:
                r9.f0(this.f34609b, (String) obj);
                return;
            case 1:
                this.f34609b.f35147q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f34609b.f35147q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f34609b.f35147q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
