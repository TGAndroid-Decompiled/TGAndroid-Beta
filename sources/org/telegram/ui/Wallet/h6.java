package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class h6 implements Runnable {
    public final int f33245a;
    public final Utilities.Callback f33246b;

    public h6(int i10, Utilities.Callback callback) {
        this.f33245a = i10;
        this.f33246b = callback;
    }

    @Override
    public final void run() {
        switch (this.f33245a) {
            case 0:
                this.f33246b.run("Wallet engine is closed");
                return;
            case 1:
                this.f33246b.run(null);
                return;
            default:
                this.f33246b.run(null);
                return;
        }
    }
}
