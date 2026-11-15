package org.telegram.ui.Components.voip;
public final class a3 implements Runnable {
    public final int f40497a;
    public final f3 f40498b;
    public final int f40499c;

    public a3(f3 f3Var, int i7, int i10) {
        this.f40497a = i10;
        this.f40498b = f3Var;
        this.f40499c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40497a) {
            case 0:
                org.telegram.messenger.g0.h3(new a3(this.f40498b, this.f40499c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a3(this.f40498b, this.f40499c, 3));
                return;
            case 2:
                this.f40498b.c(this.f40499c);
                return;
            default:
                this.f40498b.a(this.f40499c);
                return;
        }
    }
}
