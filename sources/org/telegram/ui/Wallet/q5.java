package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f43014a;
    public final r5 f43015b;

    public q5(r5 r5Var, int i7) {
        this.f43014a = i7;
        this.f43015b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f43014a) {
            case 0:
                org.telegram.messenger.g0.h3(new q5(this.f43015b, 1));
                return;
            default:
                this.f43015b.a();
                return;
        }
    }
}
