package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f34862a;
    public final Utilities.Callback f34863b;

    public s6(int i10, Utilities.Callback callback) {
        this.f34862a = i10;
        this.f34863b = callback;
    }

    @Override
    public final void run() {
        switch (this.f34862a) {
            case 0:
                this.f34863b.run("Wallet engine is closed");
                return;
            case 1:
                this.f34863b.run(null);
                return;
            default:
                this.f34863b.run(null);
                return;
        }
    }
}
