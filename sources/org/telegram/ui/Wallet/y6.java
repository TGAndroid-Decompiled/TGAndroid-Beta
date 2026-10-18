package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35131a;
    public final Utilities.Callback f35132b;

    public y6(int i10, Utilities.Callback callback) {
        this.f35131a = i10;
        this.f35132b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35131a) {
            case 0:
                this.f35132b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35132b.run(null);
                return;
            default:
                this.f35132b.run(null);
                return;
        }
    }
}
