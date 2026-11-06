package org.telegram.ui.Wallet;
public final class s5 implements Runnable {
    public final int f43133a;
    public final t5 f43134b;

    public s5(t5 t5Var, int i7) {
        this.f43133a = i7;
        this.f43134b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f43133a) {
            case 0:
                org.telegram.messenger.g0.h3(new s5(this.f43134b, 1));
                return;
            default:
                this.f43134b.a();
                return;
        }
    }
}
