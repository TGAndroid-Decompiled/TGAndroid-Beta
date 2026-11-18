package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
public final class r7 implements Runnable {
    public final int f44881a;
    public final x10 f44882b;

    public r7(x10 x10Var, int i7) {
        this.f44881a = i7;
        this.f44882b = x10Var;
    }

    @Override
    public final void run() {
        switch (this.f44881a) {
            case 0:
                this.f44882b.a("Wallet engine is closed");
                return;
            case 1:
                this.f44882b.a(null);
                return;
            default:
                this.f44882b.a(null);
                return;
        }
    }
}
