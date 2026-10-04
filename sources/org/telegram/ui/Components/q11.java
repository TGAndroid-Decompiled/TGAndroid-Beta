package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f29865a;
    public final t11 f29866b;
    public final s11 f29867c;

    public q11(t11 t11Var, s11 s11Var, int i10) {
        this.f29865a = i10;
        this.f29866b = t11Var;
        this.f29867c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29865a) {
            case 0:
                this.f29866b.b(this.f29867c);
                return;
            case 1:
                this.f29866b.b(this.f29867c);
                return;
            default:
                this.f29866b.b(this.f29867c);
                return;
        }
    }
}
