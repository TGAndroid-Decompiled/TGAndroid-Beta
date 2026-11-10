package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;
public final class c9 implements c20 {
    public final int f42246a;
    public final o9 f42247b;

    public c9(o9 o9Var, int i7) {
        this.f42246a = i7;
        this.f42247b = o9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42246a) {
            case 0:
                o9.f0(this.f42247b, (String) obj);
                return;
            case 1:
                this.f42247b.f42934q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f42247b.f42934q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f42247b.f42934q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
