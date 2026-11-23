package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
public final class r7 implements Runnable {
    public final int f44891a;
    public final y10 f44892b;

    public r7(y10 y10Var, int i7) {
        this.f44891a = i7;
        this.f44892b = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f44891a) {
            case 0:
                this.f44892b.a("Wallet engine is closed");
                return;
            case 1:
                this.f44892b.a(null);
                return;
            default:
                this.f44892b.a(null);
                return;
        }
    }
}
