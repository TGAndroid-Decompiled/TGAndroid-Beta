package org.telegram.ui.Components;
public final class r01 implements Runnable {
    public final int f27509a;
    public final u01 f27510b;
    public final t01 f27511c;

    public r01(u01 u01Var, t01 t01Var, int i10) {
        this.f27509a = i10;
        this.f27510b = u01Var;
        this.f27511c = t01Var;
    }

    @Override
    public final void run() {
        switch (this.f27509a) {
            case 0:
                this.f27510b.b(this.f27511c);
                return;
            case 1:
                this.f27510b.b(this.f27511c);
                return;
            default:
                this.f27510b.b(this.f27511c);
                return;
        }
    }
}
