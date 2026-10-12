package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class k6 implements Runnable {
    public final int f34977a;
    public final Utilities.Callback f34978b;

    public k6(int i10, Utilities.Callback callback) {
        this.f34977a = i10;
        this.f34978b = callback;
    }

    @Override
    public final void run() {
        switch (this.f34977a) {
            case 0:
                this.f34978b.run("Wallet engine is closed");
                return;
            case 1:
                this.f34978b.run(null);
                return;
            default:
                this.f34978b.run(null);
                return;
        }
    }
}
