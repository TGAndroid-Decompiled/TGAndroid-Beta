package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class c7 implements Runnable {
    public final int f42249a;
    public final c20 f42250b;

    public c7(c20 c20Var, int i7) {
        this.f42249a = i7;
        this.f42250b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42249a) {
            case 0:
                this.f42250b.a("Wallet engine is closed");
                return;
            case 1:
                this.f42250b.a(null);
                return;
            default:
                this.f42250b.a(null);
                return;
        }
    }
}
