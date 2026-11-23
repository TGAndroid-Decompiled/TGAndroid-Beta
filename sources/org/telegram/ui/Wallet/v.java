package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
public final class v implements Runnable {
    public final int f45253a;
    public final p10 f45254b;

    public v(p10 p10Var, int i7) {
        this.f45253a = i7;
        this.f45254b = p10Var;
    }

    @Override
    public final void run() {
        switch (this.f45253a) {
            case 0:
                v0.n("getSecretPhrase: password request closed without a result");
                this.f45254b.a(null, "WALLET_SEND_CANCELLED");
                return;
            case 1:
                this.f45254b.a(null, "Wallet engine is closed");
                return;
            case 2:
                this.f45254b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f45254b.a(null, "NO_WALLET_ENGINE");
                return;
            case 4:
                this.f45254b.a(null, "Recovery phrase is required");
                return;
            case 5:
                this.f45254b.a(null, "Transaction hash is required");
                return;
            case 6:
                this.f45254b.a(null, "NO_WALLET_ENGINE");
                return;
            case 7:
                this.f45254b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f45254b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }

    public v(v0 v0Var, p10 p10Var) {
        this.f45253a = 0;
        this.f45254b = p10Var;
    }
}
