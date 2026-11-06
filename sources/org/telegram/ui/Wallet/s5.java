package org.telegram.ui.Wallet;
public final class s5 implements Runnable {
    public final int f43109a;
    public final t5 f43110b;

    public s5(t5 t5Var, int i7) {
        this.f43109a = i7;
        this.f43110b = t5Var;
    }

    @Override
    public final void run() {
        switch (this.f43109a) {
            case 0:
                org.telegram.messenger.g0.h3(new s5(this.f43110b, 1));
                return;
            default:
                this.f43110b.a();
                return;
        }
    }
}
