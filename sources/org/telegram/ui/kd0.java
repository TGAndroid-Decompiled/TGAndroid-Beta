package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f49290a;
    public final r3 f49291b;

    public kd0(r3 r3Var, int i7) {
        this.f49290a = i7;
        this.f49291b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f49290a) {
            case 0:
                org.telegram.messenger.g0.g3(new kd0(this.f49291b, 1));
                return;
            default:
                this.f49291b.a("CANCELLED");
                return;
        }
    }
}
