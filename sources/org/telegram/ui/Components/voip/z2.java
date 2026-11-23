package org.telegram.ui.Components.voip;
public final class z2 implements Runnable {
    public final int f41518a;
    public final e3 f41519b;
    public final int f41520c;

    public z2(e3 e3Var, int i7, int i10) {
        this.f41518a = i10;
        this.f41519b = e3Var;
        this.f41520c = i7;
    }

    @Override
    public final void run() {
        switch (this.f41518a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.f41519b, this.f41520c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.f41519b, this.f41520c, 3));
                return;
            case 2:
                this.f41519b.c(this.f41520c);
                return;
            default:
                this.f41519b.a(this.f41520c);
                return;
        }
    }
}
