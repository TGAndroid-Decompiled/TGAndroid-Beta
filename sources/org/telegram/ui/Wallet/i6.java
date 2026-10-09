package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f35041a;
    public final Utilities.Callback f35042b;

    public i6(int i10, Utilities.Callback callback) {
        this.f35041a = i10;
        this.f35042b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35041a) {
            case 0:
                this.f35042b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35042b.run(null);
                return;
            default:
                this.f35042b.run(null);
                return;
        }
    }
}
