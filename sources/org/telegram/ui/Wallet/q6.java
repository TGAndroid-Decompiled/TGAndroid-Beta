package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class q6 implements Runnable {
    public final int f34780a;
    public final Utilities.Callback2 f34781b;

    public q6(int i10, Utilities.Callback2 callback2) {
        this.f34780a = i10;
        this.f34781b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f34780a) {
            case 0:
                this.f34781b.run(null, "Wallet engine is closed");
                return;
            case 1:
                this.f34781b.run(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f34781b.run(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f34781b.run(null, "Recovery phrase is required");
                return;
            case 4:
                this.f34781b.run(null, "Transaction hash is required");
                return;
            case 5:
                this.f34781b.run(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f34781b.run(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f34781b.run(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
