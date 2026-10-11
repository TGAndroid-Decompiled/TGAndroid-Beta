package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f35117a;
    public final Utilities.Callback2 f35118b;

    public i6(int i10, Utilities.Callback2 callback2) {
        this.f35117a = i10;
        this.f35118b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f35117a) {
            case 0:
                this.f35118b.run(null, "Wallet engine is closed");
                return;
            case 1:
                this.f35118b.run(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f35118b.run(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f35118b.run(null, "Recovery phrase is required");
                return;
            case 4:
                this.f35118b.run(null, "Transaction hash is required");
                return;
            case 5:
                this.f35118b.run(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f35118b.run(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f35118b.run(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
