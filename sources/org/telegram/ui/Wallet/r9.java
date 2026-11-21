package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_wallet;
public final class r9 implements x10 {
    public final int f44983a;
    public final da f44984b;

    public r9(da daVar, int i7) {
        this.f44983a = i7;
        this.f44984b = daVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f44983a) {
            case 0:
                da.f0(this.f44984b, (String) obj);
                return;
            case 1:
                this.f44984b.f44113r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f44984b.f44113r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f44984b.f44113r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
