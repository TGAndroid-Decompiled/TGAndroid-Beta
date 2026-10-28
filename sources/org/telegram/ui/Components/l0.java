package org.telegram.ui.Components;
public final class l0 implements ld0 {
    public final int f30074a;
    public final nd0 f30075b;
    public final nd0 f30076c;
    public final nd0 d;

    public l0(nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3, int i10) {
        this.f30074a = i10;
        this.f30075b = nd0Var;
        this.f30076c = nd0Var2;
        this.d = nd0Var3;
    }

    @Override
    public final void q(nd0 nd0Var, int i10) {
        switch (this.f30074a) {
            case 0:
                g5.b(this.f30075b, this.f30076c, this.d);
                return;
            case 1:
                g5.x0(this.f30075b, this.f30076c, this.d);
                return;
            default:
                g5.x0(this.f30075b, this.f30076c, this.d);
                return;
        }
    }
}
