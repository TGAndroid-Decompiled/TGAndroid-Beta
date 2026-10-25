package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class p6 implements Runnable {
    public final int f37098a;
    public final Utilities.Callback2 f37099b;

    public p6(int i10, Utilities.Callback2 callback2) {
        this.f37098a = i10;
        this.f37099b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f37098a) {
            case 0:
                this.f37099b.run(null, "Wallet engine is closed");
                return;
            case 1:
                this.f37099b.run(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f37099b.run(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f37099b.run(null, "Recovery phrase is required");
                return;
            case 4:
                this.f37099b.run(null, "Transaction hash is required");
                return;
            case 5:
                this.f37099b.run(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f37099b.run(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f37099b.run(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
