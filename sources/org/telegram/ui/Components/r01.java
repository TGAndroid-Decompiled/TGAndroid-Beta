package org.telegram.ui.Components;
public final class r01 implements Runnable {
    public final int f29875a;
    public final u01 f29876b;
    public final t01 f29877c;

    public r01(u01 u01Var, t01 t01Var, int i10) {
        this.f29875a = i10;
        this.f29876b = u01Var;
        this.f29877c = t01Var;
    }

    @Override
    public final void run() {
        switch (this.f29875a) {
            case 0:
                this.f29876b.b(this.f29877c);
                return;
            case 1:
                this.f29876b.b(this.f29877c);
                return;
            default:
                this.f29876b.b(this.f29877c);
                return;
        }
    }
}
