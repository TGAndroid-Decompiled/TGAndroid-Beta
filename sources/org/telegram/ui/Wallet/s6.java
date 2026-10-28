package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f37246a;
    public final Utilities.Callback f37247b;

    public s6(int i10, Utilities.Callback callback) {
        this.f37246a = i10;
        this.f37247b = callback;
    }

    @Override
    public final void run() {
        switch (this.f37246a) {
            case 0:
                this.f37247b.run("Wallet engine is closed");
                return;
            case 1:
                this.f37247b.run(null);
                return;
            default:
                this.f37247b.run(null);
                return;
        }
    }
}
