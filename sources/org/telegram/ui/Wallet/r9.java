package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
public final class r9 implements y10 {
    public final int f44987a;
    public final da f44988b;

    public r9(da daVar, int i7) {
        this.f44987a = i7;
        this.f44988b = daVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f44987a) {
            case 0:
                da.f0(this.f44988b, (String) obj);
                return;
            case 1:
                this.f44988b.f44117r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f44988b.f44117r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f44988b.f44117r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
