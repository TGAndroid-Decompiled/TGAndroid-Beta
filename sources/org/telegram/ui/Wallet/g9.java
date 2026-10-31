package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_wallet;
public final class g9 implements q20 {
    public final int f34602a;
    public final r9 f34603b;

    public g9(r9 r9Var, int i10) {
        this.f34602a = i10;
        this.f34603b = r9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34602a) {
            case 0:
                r9.e0(this.f34603b, (String) obj);
                return;
            case 1:
                this.f34603b.f35142q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f34603b.f35142q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f34603b.f35142q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
