package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
public final class e7 implements Runnable {
    public final int f34461a;
    public final k20 f34462b;

    public e7(k20 k20Var, int i10) {
        this.f34461a = i10;
        this.f34462b = k20Var;
    }

    @Override
    public final void run() {
        switch (this.f34461a) {
            case 0:
                this.f34462b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f34462b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f34462b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f34462b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f34462b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f34462b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f34462b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f34462b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
