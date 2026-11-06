package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;
public final class b9 implements c20 {
    public final int f42154a;
    public final n9 f42155b;

    public b9(n9 n9Var, int i7) {
        this.f42154a = i7;
        this.f42155b = n9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42154a) {
            case 0:
                n9.f0(this.f42155b, (String) obj);
                return;
            case 1:
                this.f42155b.f42838q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f42155b.f42838q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f42155b.f42838q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
