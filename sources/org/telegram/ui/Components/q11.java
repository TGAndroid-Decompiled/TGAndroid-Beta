package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f29859a;
    public final t11 f29860b;
    public final s11 f29861c;

    public q11(t11 t11Var, s11 s11Var, int i10) {
        this.f29859a = i10;
        this.f29860b = t11Var;
        this.f29861c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29859a) {
            case 0:
                this.f29860b.b(this.f29861c);
                return;
            case 1:
                this.f29860b.b(this.f29861c);
                return;
            default:
                this.f29860b.b(this.f29861c);
                return;
        }
    }
}
