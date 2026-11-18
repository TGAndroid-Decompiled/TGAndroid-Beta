package org.telegram.ui;
public final class ld0 implements Runnable {
    public final int f49549a;
    public final r3 f49550b;

    public ld0(r3 r3Var, int i7) {
        this.f49549a = i7;
        this.f49550b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f49549a) {
            case 0:
                org.telegram.messenger.g0.g3(new ld0(this.f49550b, 1));
                return;
            default:
                this.f49550b.a("CANCELLED");
                return;
        }
    }
}
