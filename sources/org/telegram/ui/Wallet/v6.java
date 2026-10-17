package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class v6 implements Runnable {
    public final int f34991a;
    public final Utilities.Callback f34992b;

    public v6(int i10, Utilities.Callback callback) {
        this.f34991a = i10;
        this.f34992b = callback;
    }

    @Override
    public final void run() {
        switch (this.f34991a) {
            case 0:
                this.f34992b.run("Wallet engine is closed");
                return;
            case 1:
                this.f34992b.run(null);
                return;
            default:
                this.f34992b.run(null);
                return;
        }
    }
}
