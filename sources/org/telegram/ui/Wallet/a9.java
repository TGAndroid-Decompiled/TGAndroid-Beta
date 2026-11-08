package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_wallet;
public final class a9 implements c20 {
    public final int f42150a;
    public final m9 f42151b;

    public a9(m9 m9Var, int i7) {
        this.f42150a = i7;
        this.f42151b = m9Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42150a) {
            case 0:
                m9.f0(this.f42151b, (String) obj);
                return;
            case 1:
                this.f42151b.f42832q0 = (TL_wallet.walletTransaction) obj;
                return;
            case 2:
                this.f42151b.f42832q0 = (TL_wallet.walletTransaction) obj;
                return;
            default:
                this.f42151b.f42832q0 = (TL_wallet.walletTransaction) obj;
                return;
        }
    }
}
