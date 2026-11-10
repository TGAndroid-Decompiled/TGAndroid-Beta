package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class d7 implements Runnable {
    public final int f42373a;
    public final c20 f42374b;

    public d7(c20 c20Var, int i7) {
        this.f42373a = i7;
        this.f42374b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42373a) {
            case 0:
                this.f42374b.a("Wallet engine is closed");
                return;
            case 1:
                this.f42374b.a(null);
                return;
            default:
                this.f42374b.a(null);
                return;
        }
    }
}
