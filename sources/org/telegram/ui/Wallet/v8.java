package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v8 implements Utilities.Callback {
    public final int f35031a;
    public final i9 f35032b;

    public v8(i9 i9Var, int i10) {
        this.f35031a = i10;
        this.f35032b = i9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35031a) {
            case 0:
                i9.a0(this.f35032b, (String) obj);
                return;
            case 1:
                this.f35032b.f34362n0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35032b.f34362n0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35032b.f34362n0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
