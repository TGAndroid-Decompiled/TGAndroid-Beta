package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
public final class r7 implements Runnable {
    public final int f44921a;
    public final x10 f44922b;

    public r7(x10 x10Var, int i7) {
        this.f44921a = i7;
        this.f44922b = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f44921a) {
            case 0:
                this.f44922b.a("Wallet engine is closed");
                return;
            case 1:
                this.f44922b.a(null);
                return;
            default:
                this.f44922b.a(null);
                return;
        }
    }
}
