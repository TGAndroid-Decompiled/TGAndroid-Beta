package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.tgnet.tl.TL_wallet;
public final class r9 implements y10 {
    public final int f44953a;
    public final da f44954b;

    public r9(da daVar, int i7) {
        this.f44953a = i7;
        this.f44954b = daVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f44953a) {
            case 0:
                da.f0(this.f44954b, (String) obj);
                return;
            case 1:
                this.f44954b.f44083r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f44954b.f44083r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f44954b.f44083r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
