package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
public final class s9 implements w10 {
    public final int f45115a;
    public final ea f45116b;

    public s9(ea eaVar, int i7) {
        this.f45115a = i7;
        this.f45116b = eaVar;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45115a) {
            case 0:
                ea.f0(this.f45116b, (String) obj);
                return;
            case 1:
                this.f45116b.f44245r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f45116b.f44245r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f45116b.f44245r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
