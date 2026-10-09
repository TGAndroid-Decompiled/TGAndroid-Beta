package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f34978a;
    public final Utilities.Callback f34979b;

    public h6(int i10, Utilities.Callback callback) {
        this.f34978a = i10;
        this.f34979b = callback;
    }

    @Override
    public final void run() {
        switch (this.f34978a) {
            case 0:
                this.f34979b.run("Wallet engine is closed");
                return;
            case 1:
                this.f34979b.run(null);
                return;
            default:
                this.f34979b.run(null);
                return;
        }
    }
}
