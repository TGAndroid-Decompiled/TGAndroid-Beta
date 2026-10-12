package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f34975a;
    public final Utilities.Callback f34976b;

    public k6(int i10, Utilities.Callback callback) {
        this.f34975a = i10;
        this.f34976b = callback;
    }

    @Override
    public final void run() {
        switch (this.f34975a) {
            case 0:
                this.f34976b.run("Wallet engine is closed");
                return;
            case 1:
                this.f34976b.run(null);
                return;
            default:
                this.f34976b.run(null);
                return;
        }
    }
}
