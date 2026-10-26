package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f37222a;
    public final Utilities.Callback f37223b;

    public s6(int i10, Utilities.Callback callback) {
        this.f37222a = i10;
        this.f37223b = callback;
    }

    @Override
    public final void run() {
        switch (this.f37222a) {
            case 0:
                this.f37223b.run("Wallet engine is closed");
                return;
            case 1:
                this.f37223b.run(null);
                return;
            default:
                this.f37223b.run(null);
                return;
        }
    }
}
