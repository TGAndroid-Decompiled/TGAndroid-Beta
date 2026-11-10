package org.telegram.ui;
public final class nd0 implements Runnable {
    public final int f48193a;
    public final r3 f48194b;

    public nd0(r3 r3Var, int i7) {
        this.f48193a = i7;
        this.f48194b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f48193a) {
            case 0:
                org.telegram.messenger.g0.h3(new nd0(this.f48194b, 1));
                return;
            default:
                this.f48194b.a("CANCELLED");
                return;
        }
    }
}
