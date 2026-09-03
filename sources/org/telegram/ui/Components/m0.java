package org.telegram.ui.Components;
public final class m0 implements vc0 {
    public final int f26898a;
    public final xc0 f26899b;
    public final xc0 f26900c;
    public final xc0 d;

    public m0(xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, int i10) {
        this.f26898a = i10;
        this.f26899b = xc0Var;
        this.f26900c = xc0Var2;
        this.d = xc0Var3;
    }

    @Override
    public final void q(xc0 xc0Var, int i10) {
        switch (this.f26898a) {
            case 0:
                z4.b(this.f26899b, this.f26900c, this.d);
                return;
            case 1:
                z4.y0(this.f26899b, this.f26900c, this.d);
                return;
            default:
                z4.y0(this.f26899b, this.f26900c, this.d);
                return;
        }
    }
}
