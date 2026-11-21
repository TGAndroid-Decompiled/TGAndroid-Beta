package org.telegram.ui.Components.voip;
public final class z2 implements Runnable {
    public final int f41516a;
    public final e3 f41517b;
    public final int f41518c;

    public z2(e3 e3Var, int i7, int i10) {
        this.f41516a = i10;
        this.f41517b = e3Var;
        this.f41518c = i7;
    }

    @Override
    public final void run() {
        switch (this.f41516a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.f41517b, this.f41518c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.f41517b, this.f41518c, 3));
                return;
            case 2:
                this.f41517b.c(this.f41518c);
                return;
            default:
                this.f41517b.a(this.f41518c);
                return;
        }
    }
}
