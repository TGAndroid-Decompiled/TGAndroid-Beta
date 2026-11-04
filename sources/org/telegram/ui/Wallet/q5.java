package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f43086a;
    public final r5 f43087b;

    public q5(r5 r5Var, int i3) {
        this.f43086a = i3;
        this.f43087b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f43086a) {
            case 0:
                org.telegram.messenger.g0.h3(new q5(this.f43087b, 1));
                return;
            default:
                this.f43087b.a();
                return;
        }
    }
}
