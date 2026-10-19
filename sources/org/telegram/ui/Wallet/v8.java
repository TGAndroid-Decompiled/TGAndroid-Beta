package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v8 implements Utilities.Callback {
    public final int f35019a;
    public final i9 f35020b;

    public v8(i9 i9Var, int i10) {
        this.f35019a = i10;
        this.f35020b = i9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35019a) {
            case 0:
                i9.a0(this.f35020b, (String) obj);
                return;
            case 1:
                this.f35020b.f34350n0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35020b.f34350n0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35020b.f34350n0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
