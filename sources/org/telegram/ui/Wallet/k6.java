package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f35167a;
    public final Utilities.Callback f35168b;

    public k6(int i10, Utilities.Callback callback) {
        this.f35167a = i10;
        this.f35168b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35167a) {
            case 0:
                this.f35168b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35168b.run(null);
                return;
            default:
                this.f35168b.run(null);
                return;
        }
    }
}
