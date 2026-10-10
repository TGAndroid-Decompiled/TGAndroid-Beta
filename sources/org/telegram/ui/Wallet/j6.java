package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f35137a;
    public final Utilities.Callback f35138b;

    public j6(int i10, Utilities.Callback callback) {
        this.f35137a = i10;
        this.f35138b = callback;
    }

    @Override
    public final void run() {
        switch (this.f35137a) {
            case 0:
                this.f35138b.run("Wallet engine is closed");
                return;
            case 1:
                this.f35138b.run(null);
                return;
            default:
                this.f35138b.run(null);
                return;
        }
    }
}
