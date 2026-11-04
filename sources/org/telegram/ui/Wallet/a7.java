package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
public final class a7 implements Runnable {
    public final int f42160a;
    public final u10 f42161b;

    public a7(u10 u10Var, int i3) {
        this.f42160a = i3;
        this.f42161b = u10Var;
    }

    @Override
    public final void run() {
        switch (this.f42160a) {
            case 0:
                this.f42161b.a("Wallet engine is closed");
                return;
            case 1:
                this.f42161b.a(null);
                return;
            default:
                this.f42161b.a(null);
                return;
        }
    }
}
