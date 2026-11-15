package org.telegram.ui.Components;
public final class bz0 implements Runnable {
    public final int f33432a;
    public final dz0 f33433b;
    public final cz0 f33434c;

    public bz0(dz0 dz0Var, cz0 cz0Var, int i7) {
        this.f33432a = i7;
        this.f33433b = dz0Var;
        this.f33434c = cz0Var;
    }

    @Override
    public final void run() {
        switch (this.f33432a) {
            case 0:
                this.f33433b.a(this.f33434c);
                return;
            case 1:
                this.f33433b.a(this.f33434c);
                return;
            default:
                this.f33433b.a(this.f33434c);
                return;
        }
    }
}
