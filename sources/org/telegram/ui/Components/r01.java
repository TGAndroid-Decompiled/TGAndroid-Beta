package org.telegram.ui.Components;
public final class r01 implements Runnable {
    public final int f29902a;
    public final u01 f29903b;
    public final t01 f29904c;

    public r01(u01 u01Var, t01 t01Var, int i10) {
        this.f29902a = i10;
        this.f29903b = u01Var;
        this.f29904c = t01Var;
    }

    @Override
    public final void run() {
        switch (this.f29902a) {
            case 0:
                this.f29903b.b(this.f29904c);
                return;
            case 1:
                this.f29903b.b(this.f29904c);
                return;
            default:
                this.f29903b.b(this.f29904c);
                return;
        }
    }
}
