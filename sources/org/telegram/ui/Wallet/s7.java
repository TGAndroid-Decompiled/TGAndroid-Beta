package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
public final class s7 implements Runnable {
    public final int f45053a;
    public final w10 f45054b;

    public s7(w10 w10Var, int i7) {
        this.f45053a = i7;
        this.f45054b = w10Var;
    }

    @Override
    public final void run() {
        switch (this.f45053a) {
            case 0:
                this.f45054b.a("Wallet engine is closed");
                return;
            case 1:
                this.f45054b.a(null);
                return;
            default:
                this.f45054b.a(null);
                return;
        }
    }
}
