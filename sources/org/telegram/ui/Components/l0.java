package org.telegram.ui.Components;
public final class l0 implements od0 {
    public final int f28188a;
    public final qd0 f28189b;
    public final qd0 f28190c;
    public final qd0 d;

    public l0(qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3, int i10) {
        this.f28188a = i10;
        this.f28189b = qd0Var;
        this.f28190c = qd0Var2;
        this.d = qd0Var3;
    }

    @Override
    public final void n(qd0 qd0Var, int i10) {
        switch (this.f28188a) {
            case 0:
                f5.b(this.f28189b, this.f28190c, this.d);
                return;
            case 1:
                f5.y0(this.f28189b, this.f28190c, this.d);
                return;
            default:
                f5.y0(this.f28189b, this.f28190c, this.d);
                return;
        }
    }
}
