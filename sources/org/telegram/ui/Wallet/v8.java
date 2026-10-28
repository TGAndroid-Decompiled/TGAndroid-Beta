package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
public final class v8 implements Utilities.Callback {
    public final int f37409a;
    public final i9 f37410b;

    public v8(i9 i9Var, int i10) {
        this.f37409a = i10;
        this.f37410b = i9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37409a) {
            case 0:
                i9.b0(this.f37410b, (String) obj);
                return;
            case 1:
                this.f37410b.f36733q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f37410b.f36733q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f37410b.f36733q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
