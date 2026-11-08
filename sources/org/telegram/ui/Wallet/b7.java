package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class b7 implements Runnable {
    public final int f42214a;
    public final c20 f42215b;

    public b7(c20 c20Var, int i7) {
        this.f42214a = i7;
        this.f42215b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42214a) {
            case 0:
                this.f42215b.a("Wallet engine is closed");
                return;
            case 1:
                this.f42215b.a(null);
                return;
            default:
                this.f42215b.a(null);
                return;
        }
    }
}
