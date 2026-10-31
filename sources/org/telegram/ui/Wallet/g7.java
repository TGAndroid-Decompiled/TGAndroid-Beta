package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
public final class g7 implements Runnable {
    public final int f34574a;
    public final q20 f34575b;

    public g7(q20 q20Var, int i10) {
        this.f34574a = i10;
        this.f34575b = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f34574a) {
            case 0:
                this.f34575b.a("Wallet engine is closed");
                return;
            case 1:
                this.f34575b.a(null);
                return;
            default:
                this.f34575b.a(null);
                return;
        }
    }
}
