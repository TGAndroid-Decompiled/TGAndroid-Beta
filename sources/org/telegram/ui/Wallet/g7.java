package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
public final class g7 implements Runnable {
    public final int f34580a;
    public final r20 f34581b;

    public g7(r20 r20Var, int i10) {
        this.f34580a = i10;
        this.f34581b = r20Var;
    }

    @Override
    public final void run() {
        switch (this.f34580a) {
            case 0:
                this.f34581b.a("Wallet engine is closed");
                return;
            case 1:
                this.f34581b.a(null);
                return;
            default:
                this.f34581b.a(null);
                return;
        }
    }
}
