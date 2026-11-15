package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
public final class c7 implements Runnable {
    public final int f43643a;
    public final z10 f43644b;

    public c7(z10 z10Var, int i7) {
        this.f43643a = i7;
        this.f43644b = z10Var;
    }

    @Override
    public final void run() {
        switch (this.f43643a) {
            case 0:
                this.f43644b.a("Wallet engine is closed");
                return;
            case 1:
                this.f43644b.a(null);
                return;
            default:
                this.f43644b.a(null);
                return;
        }
    }
}
