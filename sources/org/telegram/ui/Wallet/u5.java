package org.telegram.ui.Wallet;
public final class u5 implements Runnable {
    public final int f35279a;
    public final v5 f35280b;

    public u5(v5 v5Var, int i10) {
        this.f35279a = i10;
        this.f35280b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f35279a) {
            case 0:
                org.telegram.messenger.i0.g3(new u5(this.f35280b, 1));
                return;
            default:
                this.f35280b.a();
                return;
        }
    }
}
