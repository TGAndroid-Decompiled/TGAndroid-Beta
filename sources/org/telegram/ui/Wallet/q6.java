package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class q6 implements Runnable {
    public final int f37159a;
    public final Utilities.Callback2 f37160b;

    public q6(int i10, Utilities.Callback2 callback2) {
        this.f37159a = i10;
        this.f37160b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37159a) {
            case 0:
                this.f37160b.run(null, "Wallet engine is closed");
                return;
            case 1:
                this.f37160b.run(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f37160b.run(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f37160b.run(null, "Recovery phrase is required");
                return;
            case 4:
                this.f37160b.run(null, "Transaction hash is required");
                return;
            case 5:
                this.f37160b.run(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f37160b.run(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f37160b.run(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
