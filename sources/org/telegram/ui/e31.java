package org.telegram.ui;
public final class e31 implements Runnable {
    public final int f35457a;
    public final g31 f35458b;
    public final int f35459c;
    public final int d;

    public e31(g31 g31Var, int i10, int i11, int i12) {
        this.f35457a = i12;
        this.f35458b = g31Var;
        this.f35459c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f35457a) {
            case 0:
                this.f35458b.b(this.f35459c, this.d);
                return;
            case 1:
                this.f35458b.b(this.f35459c, this.d);
                return;
            default:
                this.f35458b.b(this.f35459c, this.d);
                return;
        }
    }
}
