package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class c7 implements Runnable {
    public final int f42224a;
    public final c20 f42225b;

    public c7(c20 c20Var, int i7) {
        this.f42224a = i7;
        this.f42225b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42224a) {
            case 0:
                this.f42225b.a("Wallet engine is closed");
                return;
            case 1:
                this.f42225b.a(null);
                return;
            default:
                this.f42225b.a(null);
                return;
        }
    }
}
