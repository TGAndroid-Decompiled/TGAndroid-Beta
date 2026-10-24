package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class w8 implements Utilities.Callback {
    public final int f35359a;
    public final j9 f35360b;

    public w8(j9 j9Var, int i10) {
        this.f35359a = i10;
        this.f35360b = j9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35359a) {
            case 0:
                j9.a0(this.f35360b, (String) obj);
                return;
            case 1:
                this.f35360b.f34675p0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f35360b.f34675p0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f35360b.f34675p0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
