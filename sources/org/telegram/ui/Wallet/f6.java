package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33180a;
    public final Utilities.Callback2 f33181b;

    public f6(int i10, Utilities.Callback2 callback2) {
        this.f33180a = i10;
        this.f33181b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f33180a) {
            case 0:
                this.f33181b.run(null, "Wallet engine is closed");
                return;
            case 1:
                this.f33181b.run(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f33181b.run(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f33181b.run(null, "Recovery phrase is required");
                return;
            case 4:
                this.f33181b.run(null, "Transaction hash is required");
                return;
            case 5:
                this.f33181b.run(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f33181b.run(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f33181b.run(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
