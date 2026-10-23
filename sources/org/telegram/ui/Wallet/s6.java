package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f35151a;
    public final Utilities.Callback f35152b;

    public s6(int i10, Utilities.Callback callback) {
        this.f35151a = i10;
        this.f35152b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35151a) {
            case 0:
                this.f35152b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35152b.run(null);
                return;
            default:
                this.f35152b.run(null);
                return;
        }
    }
}
