package org.telegram.ui.Components;
public final class l0 implements kd0 {
    public final int f30009a;
    public final md0 f30010b;
    public final md0 f30011c;
    public final md0 d;

    public l0(md0 md0Var, md0 md0Var2, md0 md0Var3, int i10) {
        this.f30009a = i10;
        this.f30010b = md0Var;
        this.f30011c = md0Var2;
        this.d = md0Var3;
    }

    @Override
    public final void q(md0 md0Var, int i10) {
        switch (this.f30009a) {
            case 0:
                g5.b(this.f30010b, this.f30011c, this.d);
                return;
            case 1:
                g5.x0(this.f30010b, this.f30011c, this.d);
                return;
            default:
                g5.x0(this.f30010b, this.f30011c, this.d);
                return;
        }
    }
}
