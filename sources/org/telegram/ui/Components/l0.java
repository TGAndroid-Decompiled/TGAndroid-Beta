package org.telegram.ui.Components;
public final class l0 implements wd0 {
    public final int f27979a;
    public final yd0 f27980b;
    public final yd0 f27981c;
    public final yd0 d;

    public l0(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3, int i10) {
        this.f27979a = i10;
        this.f27980b = yd0Var;
        this.f27981c = yd0Var2;
        this.d = yd0Var3;
    }

    @Override
    public final void q(yd0 yd0Var, int i10) {
        switch (this.f27979a) {
            case 0:
                g5.a(this.f27980b, this.f27981c, this.d);
                return;
            case 1:
                g5.x0(this.f27980b, this.f27981c, this.d);
                return;
            default:
                g5.x0(this.f27980b, this.f27981c, this.d);
                return;
        }
    }
}
