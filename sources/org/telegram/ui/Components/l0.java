package org.telegram.ui.Components;
public final class l0 implements dd0 {
    public final int f25892a;
    public final fd0 f25893b;
    public final fd0 f25894c;
    public final fd0 d;

    public l0(fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, int i10) {
        this.f25892a = i10;
        this.f25893b = fd0Var;
        this.f25894c = fd0Var2;
        this.d = fd0Var3;
    }

    @Override
    public final void q(fd0 fd0Var, int i10) {
        switch (this.f25892a) {
            case 0:
                e5.b(this.f25893b, this.f25894c, this.d);
                return;
            case 1:
                e5.y0(this.f25893b, this.f25894c, this.d);
                return;
            default:
                e5.y0(this.f25893b, this.f25894c, this.d);
                return;
        }
    }
}
