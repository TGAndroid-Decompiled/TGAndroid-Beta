package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
public final class r7 implements Runnable {
    public final int f44925a;
    public final y10 f44926b;

    public r7(y10 y10Var, int i7) {
        this.f44925a = i7;
        this.f44926b = y10Var;
    }

    @Override
    public final void run() {
        switch (this.f44925a) {
            case 0:
                this.f44926b.a("Wallet engine is closed");
                return;
            case 1:
                this.f44926b.a(null);
                return;
            default:
                this.f44926b.a(null);
                return;
        }
    }
}
