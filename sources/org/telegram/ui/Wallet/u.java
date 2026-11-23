package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class u implements Runnable {
    public final int f45125a;
    public final r10 f45126b;

    public u(r10 r10Var, int i7) {
        this.f45125a = i7;
        this.f45126b = r10Var;
    }

    @Override
    public final void run() {
        switch (this.f45125a) {
            case 0:
                u0.n("getSecretPhrase: password request closed without a result");
                this.f45126b.a(null, "WALLET_SEND_CANCELLED");
                return;
            case 1:
                this.f45126b.a(null, "Wallet engine is closed");
                return;
            case 2:
                this.f45126b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f45126b.a(null, "NO_WALLET_ENGINE");
                return;
            case 4:
                this.f45126b.a(null, "Recovery phrase is required");
                return;
            case 5:
                this.f45126b.a(null, "Transaction hash is required");
                return;
            case 6:
                this.f45126b.a(null, "NO_WALLET_ENGINE");
                return;
            case 7:
                this.f45126b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f45126b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }

    public u(u0 u0Var, r10 r10Var) {
        this.f45125a = 0;
        this.f45126b = r10Var;
    }
}
