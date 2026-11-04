package org.telegram.ui.Wallet;

import org.telegram.messenger.n10;
public final class y6 implements Runnable {
    public final int f43474a;
    public final n10 f43475b;

    public y6(n10 n10Var, int i3) {
        this.f43474a = i3;
        this.f43475b = n10Var;
    }

    @Override
    public final void run() {
        switch (this.f43474a) {
            case 0:
                this.f43475b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f43475b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f43475b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f43475b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f43475b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f43475b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f43475b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f43475b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
