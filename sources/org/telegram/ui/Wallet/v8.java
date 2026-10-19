package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v8 implements Utilities.Callback {
    public final int f35021a;
    public final i9 f35022b;

    public v8(i9 i9Var, int i10) {
        this.f35021a = i10;
        this.f35022b = i9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35021a) {
            case 0:
                i9.a0(this.f35022b, (String) obj);
                return;
            case 1:
                this.f35022b.f34352n0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35022b.f34352n0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35022b.f34352n0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
