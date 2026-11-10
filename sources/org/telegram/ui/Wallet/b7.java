package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class b7 implements Runnable {
    public final int f42181a;
    public final v10 f42182b;

    public b7(v10 v10Var, int i7) {
        this.f42181a = i7;
        this.f42182b = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42181a) {
            case 0:
                this.f42182b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f42182b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f42182b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f42182b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f42182b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f42182b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f42182b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f42182b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
