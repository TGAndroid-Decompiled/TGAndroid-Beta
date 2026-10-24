package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class s6 implements Runnable {
    public final int f35153a;
    public final Utilities.Callback f35154b;

    public s6(int i10, Utilities.Callback callback) {
        this.f35153a = i10;
        this.f35154b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35153a) {
            case 0:
                this.f35154b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35154b.run(null);
                return;
            default:
                this.f35154b.run(null);
                return;
        }
    }
}
