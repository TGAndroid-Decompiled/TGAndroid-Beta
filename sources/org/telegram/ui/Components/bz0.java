package org.telegram.ui.Components;
public final class bz0 implements Runnable {
    public final int f33435a;
    public final dz0 f33436b;
    public final cz0 f33437c;

    public bz0(dz0 dz0Var, cz0 cz0Var, int i7) {
        this.f33435a = i7;
        this.f33436b = dz0Var;
        this.f33437c = cz0Var;
    }

    @Override
    public final void run() {
        switch (this.f33435a) {
            case 0:
                this.f33436b.a(this.f33437c);
                return;
            case 1:
                this.f33436b.a(this.f33437c);
                return;
            default:
                this.f33436b.a(this.f33437c);
                return;
        }
    }
}
