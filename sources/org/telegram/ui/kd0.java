package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f47176a;
    public final r3 f47177b;

    public kd0(r3 r3Var, int i7) {
        this.f47176a = i7;
        this.f47177b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f47176a) {
            case 0:
                org.telegram.messenger.g0.h3(new kd0(this.f47177b, 1));
                return;
            default:
                this.f47177b.a("CANCELLED");
                return;
        }
    }
}
