package org.telegram.ui.Components.voip;
public final class z2 implements Runnable {
    public final int f41517a;
    public final e3 f41518b;
    public final int f41519c;

    public z2(e3 e3Var, int i7, int i10) {
        this.f41517a = i10;
        this.f41518b = e3Var;
        this.f41519c = i7;
    }

    @Override
    public final void run() {
        switch (this.f41517a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.f41518b, this.f41519c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.f41518b, this.f41519c, 3));
                return;
            case 2:
                this.f41518b.c(this.f41519c);
                return;
            default:
                this.f41518b.a(this.f41519c);
                return;
        }
    }
}
