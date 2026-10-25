package org.telegram.ui.Components;
public final class l0 implements kd0 {
    public final int f30007a;
    public final md0 f30008b;
    public final md0 f30009c;
    public final md0 d;

    public l0(md0 md0Var, md0 md0Var2, md0 md0Var3, int i10) {
        this.f30007a = i10;
        this.f30008b = md0Var;
        this.f30009c = md0Var2;
        this.d = md0Var3;
    }

    @Override
    public final void q(md0 md0Var, int i10) {
        switch (this.f30007a) {
            case 0:
                g5.b(this.f30008b, this.f30009c, this.d);
                return;
            case 1:
                g5.x0(this.f30008b, this.f30009c, this.d);
                return;
            default:
                g5.x0(this.f30008b, this.f30009c, this.d);
                return;
        }
    }
}
