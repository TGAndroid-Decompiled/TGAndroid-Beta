package org.telegram.ui.Components.voip;
public final class l2 implements Runnable {
    public final int f39463a;
    public final q2 f39464b;
    public final int f39465c;

    public l2(q2 q2Var, int i3, int i10) {
        this.f39463a = i10;
        this.f39464b = q2Var;
        this.f39465c = i3;
    }

    @Override
    public final void run() {
        switch (this.f39463a) {
            case 0:
                org.telegram.messenger.g0.h3(new l2(this.f39464b, this.f39465c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new l2(this.f39464b, this.f39465c, 3));
                return;
            case 2:
                this.f39464b.c(this.f39465c);
                return;
            default:
                this.f39464b.a(this.f39465c);
                return;
        }
    }
}
