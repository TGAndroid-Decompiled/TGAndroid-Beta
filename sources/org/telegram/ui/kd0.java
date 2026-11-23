package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f49294a;
    public final r3 f49295b;

    public kd0(r3 r3Var, int i7) {
        this.f49294a = i7;
        this.f49295b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f49294a) {
            case 0:
                org.telegram.messenger.g0.g3(new kd0(this.f49295b, 1));
                return;
            default:
                this.f49295b.a("CANCELLED");
                return;
        }
    }
}
