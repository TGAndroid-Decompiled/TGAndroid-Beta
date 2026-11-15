package org.telegram.ui;
public final class id0 implements Runnable {
    public final int f48034a;
    public final r3 f48035b;

    public id0(r3 r3Var, int i7) {
        this.f48034a = i7;
        this.f48035b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f48034a) {
            case 0:
                org.telegram.messenger.g0.h3(new id0(this.f48035b, 1));
                return;
            default:
                this.f48035b.a("CANCELLED");
                return;
        }
    }
}
