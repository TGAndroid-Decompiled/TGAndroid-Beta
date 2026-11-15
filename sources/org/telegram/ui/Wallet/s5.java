package org.telegram.ui.Wallet;
public final class s5 implements Runnable {
    public final int f44484a;
    public final t5 f44485b;

    public s5(t5 t5Var, int i7) {
        this.f44484a = i7;
        this.f44485b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f44484a) {
            case 0:
                org.telegram.messenger.g0.h3(new s5(this.f44485b, 1));
                return;
            default:
                this.f44485b.a();
                return;
        }
    }
}
