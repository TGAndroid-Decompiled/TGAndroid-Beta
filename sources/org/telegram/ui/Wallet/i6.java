package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class i6 implements Runnable {
    public final int f33028a;
    public final Utilities.Callback f33029b;

    public i6(int i10, Utilities.Callback callback) {
        this.f33028a = i10;
        this.f33029b = callback;
    }

    @Override
    public final void run() {
        switch (this.f33028a) {
            case 0:
                this.f33029b.run("Wallet engine is closed");
                return;
            case 1:
                this.f33029b.run(null);
                return;
            default:
                this.f33029b.run(null);
                return;
        }
    }
}
