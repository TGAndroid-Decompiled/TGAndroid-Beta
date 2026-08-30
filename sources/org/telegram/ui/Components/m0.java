package org.telegram.ui.Components;
public final class m0 implements uc0 {
    public final int f26900a;
    public final wc0 f26901b;
    public final wc0 f26902c;
    public final wc0 d;

    public m0(wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3, int i10) {
        this.f26900a = i10;
        this.f26901b = wc0Var;
        this.f26902c = wc0Var2;
        this.d = wc0Var3;
    }

    @Override
    public final void q(wc0 wc0Var, int i10) {
        switch (this.f26900a) {
            case 0:
                z4.b(this.f26901b, this.f26902c, this.d);
                return;
            case 1:
                z4.y0(this.f26901b, this.f26902c, this.d);
                return;
            default:
                z4.y0(this.f26901b, this.f26902c, this.d);
                return;
        }
    }
}
