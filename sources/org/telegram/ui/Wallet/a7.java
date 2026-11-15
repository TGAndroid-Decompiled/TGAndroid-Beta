package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
public final class a7 implements Runnable {
    public final int f43480a;
    public final s10 f43481b;

    public a7(s10 s10Var, int i7) {
        this.f43480a = i7;
        this.f43481b = s10Var;
    }

    @Override
    public final void run() {
        switch (this.f43480a) {
            case 0:
                this.f43481b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f43481b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f43481b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f43481b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f43481b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f43481b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f43481b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f43481b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
