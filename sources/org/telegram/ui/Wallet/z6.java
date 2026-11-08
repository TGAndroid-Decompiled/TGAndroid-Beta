package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
public final class z6 implements Runnable {
    public final int f43469a;
    public final v10 f43470b;

    public z6(v10 v10Var, int i7) {
        this.f43469a = i7;
        this.f43470b = v10Var;
    }

    @Override
    public final void run() {
        switch (this.f43469a) {
            case 0:
                this.f43470b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f43470b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f43470b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f43470b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f43470b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f43470b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f43470b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f43470b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
