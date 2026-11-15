package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
public final class c9 implements z10 {
    public final int f43705a;
    public final p9 f43706b;

    public c9(p9 p9Var, int i7) {
        this.f43705a = i7;
        this.f43706b = p9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43705a) {
            case 0:
                p9.f0(this.f43706b, (String) obj);
                return;
            case 1:
                this.f43706b.f44353r0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f43706b.f44353r0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f43706b.f44353r0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
