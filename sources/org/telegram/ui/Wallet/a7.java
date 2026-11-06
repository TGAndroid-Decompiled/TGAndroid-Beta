package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class a7 implements Runnable {
    public final int f42102a;
    public final v10 f42103b;

    public a7(v10 v10Var, int i7) {
        this.f42102a = i7;
        this.f42103b = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f42102a) {
            case 0:
                this.f42103b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f42103b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f42103b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f42103b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f42103b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f42103b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f42103b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f42103b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
