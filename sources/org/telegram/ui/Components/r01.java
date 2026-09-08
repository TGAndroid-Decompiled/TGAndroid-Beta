package org.telegram.ui.Components;
public final class r01 implements Runnable {
    public final int f29901a;
    public final u01 f29902b;
    public final t01 f29903c;

    public r01(u01 u01Var, t01 t01Var, int i10) {
        this.f29901a = i10;
        this.f29902b = u01Var;
        this.f29903c = t01Var;
    }

    @Override
    public final void run() {
        switch (this.f29901a) {
            case 0:
                this.f29902b.b(this.f29903c);
                return;
            case 1:
                this.f29902b.b(this.f29903c);
                return;
            default:
                this.f29902b.b(this.f29903c);
                return;
        }
    }
}
