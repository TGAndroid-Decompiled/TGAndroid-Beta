package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f35201a;
    public final Utilities.Callback f35202b;

    public k6(int i10, Utilities.Callback callback) {
        this.f35201a = i10;
        this.f35202b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35201a) {
            case 0:
                this.f35202b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35202b.run(null);
                return;
            default:
                this.f35202b.run(null);
                return;
        }
    }
}
