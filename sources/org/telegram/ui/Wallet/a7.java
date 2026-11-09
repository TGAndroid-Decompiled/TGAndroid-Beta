package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class a7 implements Runnable {
    public final int f42134a;
    public final c20 f42135b;

    public a7(c20 c20Var, int i7) {
        this.f42134a = i7;
        this.f42135b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42134a) {
            case 0:
                this.f42135b.a("Wallet engine is closed");
                return;
            case 1:
                this.f42135b.a(null);
                return;
            default:
                this.f42135b.a(null);
                return;
        }
    }
}
