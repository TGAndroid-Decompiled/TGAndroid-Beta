package org.telegram.ui;
public final class kd0 implements Runnable {
    public final int f49252a;
    public final r3 f49253b;

    public kd0(r3 r3Var, int i7) {
        this.f49252a = i7;
        this.f49253b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f49252a) {
            case 0:
                org.telegram.messenger.g0.g3(new kd0(this.f49253b, 1));
                return;
            default:
                this.f49253b.a("CANCELLED");
                return;
        }
    }
}
