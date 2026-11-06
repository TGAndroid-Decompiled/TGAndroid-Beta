package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f47172a;
    public final r3 f47173b;

    public kd0(r3 r3Var, int i7) {
        this.f47172a = i7;
        this.f47173b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f47172a) {
            case 0:
                org.telegram.messenger.g0.h3(new kd0(this.f47173b, 1));
                return;
            default:
                this.f47173b.a("CANCELLED");
                return;
        }
    }
}
