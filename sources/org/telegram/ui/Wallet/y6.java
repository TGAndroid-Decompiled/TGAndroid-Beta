package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class y6 implements Runnable {
    public final int f43387a;
    public final v10 f43388b;

    public y6(v10 v10Var, int i7) {
        this.f43387a = i7;
        this.f43388b = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43387a) {
            case 0:
                this.f43388b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f43388b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f43388b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f43388b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f43388b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f43388b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f43388b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f43388b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
