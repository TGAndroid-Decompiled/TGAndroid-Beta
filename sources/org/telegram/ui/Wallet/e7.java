package org.telegram.ui.Wallet;

import org.telegram.messenger.j20;
public final class e7 implements Runnable {
    public final int f34463a;
    public final j20 f34464b;

    public e7(j20 j20Var, int i10) {
        this.f34463a = i10;
        this.f34464b = j20Var;
    }

    @Override
    public final void run() {
        switch (this.f34463a) {
            case 0:
                this.f34464b.a(null, "Wallet engine is closed");
                return;
            case 1:
                this.f34464b.a(null, "NO_WALLET_ENGINE");
                return;
            case 2:
                this.f34464b.a(null, "NO_WALLET_ENGINE");
                return;
            case 3:
                this.f34464b.a(null, "Recovery phrase is required");
                return;
            case 4:
                this.f34464b.a(null, "Transaction hash is required");
                return;
            case 5:
                this.f34464b.a(null, "NO_WALLET_ENGINE");
                return;
            case 6:
                this.f34464b.a(null, "NO_WALLET_ENGINE");
                return;
            default:
                this.f34464b.a(null, "NO_WALLET_ENGINE");
                return;
        }
    }
}
