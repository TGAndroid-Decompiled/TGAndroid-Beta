package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f29860a;
    public final t11 f29861b;
    public final s11 f29862c;

    public q11(t11 t11Var, s11 s11Var, int i10) {
        this.f29860a = i10;
        this.f29861b = t11Var;
        this.f29862c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29860a) {
            case 0:
                this.f29861b.b(this.f29862c);
                return;
            case 1:
                this.f29861b.b(this.f29862c);
                return;
            default:
                this.f29861b.b(this.f29862c);
                return;
        }
    }
}
