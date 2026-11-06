package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f47171a;
    public final r3 f47172b;

    public kd0(r3 r3Var, int i7) {
        this.f47171a = i7;
        this.f47172b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f47171a) {
            case 0:
                org.telegram.messenger.g0.h3(new kd0(this.f47172b, 1));
                return;
            default:
                this.f47172b.a("CANCELLED");
                return;
        }
    }
}
