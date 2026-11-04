package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
public final class a9 implements u10 {
    public final int f42189a;
    public final m9 f42190b;

    public a9(m9 m9Var, int i3) {
        this.f42189a = i3;
        this.f42190b = m9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42189a) {
            case 0:
                m9.f0(this.f42190b, (String) obj);
                return;
            case 1:
                this.f42190b.f42889r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f42190b.f42889r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f42190b.f42889r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
