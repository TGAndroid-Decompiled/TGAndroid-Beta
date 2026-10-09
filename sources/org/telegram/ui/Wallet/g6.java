package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f34964a;
    public final Utilities.Callback2 f34965b;

    public g6(int i10, Utilities.Callback2 callback2) {
        this.f34964a = i10;
        this.f34965b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34964a) {
            case 0:
                this.f34965b.run(null, "Wallet engine is closed");
                return;
            case 1:
                this.f34965b.run(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f34965b.run(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f34965b.run(null, "Recovery phrase is required");
                return;
            case 4:
                this.f34965b.run(null, "Transaction hash is required");
                return;
            case 5:
                this.f34965b.run(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f34965b.run(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f34965b.run(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
