package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v8 implements Utilities.Callback {
    public final int f37382a;
    public final i9 f37383b;

    public v8(i9 i9Var, int i10) {
        this.f37382a = i10;
        this.f37383b = i9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37382a) {
            case 0:
                i9.b0(this.f37383b, (String) obj);
                return;
            case 1:
                this.f37383b.f36705q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f37383b.f36705q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f37383b.f36705q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
