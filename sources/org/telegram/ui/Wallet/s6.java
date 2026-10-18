package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f34836a;
    public final Utilities.Callback f34837b;

    public s6(int i10, Utilities.Callback callback) {
        this.f34836a = i10;
        this.f34837b = callback;
    }

    @Override
    public final void run() {
        switch (this.f34836a) {
            case 0:
                this.f34837b.run("Wallet engine is closed");
                return;
            case 1:
                this.f34837b.run(null);
                return;
            default:
                this.f34837b.run(null);
                return;
        }
    }
}
