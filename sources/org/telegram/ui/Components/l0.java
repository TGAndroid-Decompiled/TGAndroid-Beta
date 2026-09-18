package org.telegram.ui.Components;
public final class l0 implements sc0 {
    public final int f25793a;
    public final uc0 f25794b;
    public final uc0 f25795c;
    public final uc0 d;

    public l0(uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, int i10) {
        this.f25793a = i10;
        this.f25794b = uc0Var;
        this.f25795c = uc0Var2;
        this.d = uc0Var3;
    }

    @Override
    public final void q(uc0 uc0Var, int i10) {
        switch (this.f25793a) {
            case 0:
                c5.b(this.f25794b, this.f25795c, this.d);
                return;
            case 1:
                c5.y0(this.f25794b, this.f25795c, this.d);
                return;
            default:
                c5.y0(this.f25794b, this.f25795c, this.d);
                return;
        }
    }
}
