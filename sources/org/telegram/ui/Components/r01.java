package org.telegram.ui.Components;
public final class r01 implements Runnable {
    public final int f29874a;
    public final u01 f29875b;
    public final t01 f29876c;

    public r01(u01 u01Var, t01 t01Var, int i10) {
        this.f29874a = i10;
        this.f29875b = u01Var;
        this.f29876c = t01Var;
    }

    @Override
    public final void run() {
        switch (this.f29874a) {
            case 0:
                this.f29875b.b(this.f29876c);
                return;
            case 1:
                this.f29875b.b(this.f29876c);
                return;
            default:
                this.f29875b.b(this.f29876c);
                return;
        }
    }
}
