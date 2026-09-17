package org.telegram.ui.Components;
public final class m0 implements tc0 {
    public final int f28326a;
    public final vc0 f28327b;
    public final vc0 f28328c;
    public final vc0 d;

    public m0(vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, int i10) {
        this.f28326a = i10;
        this.f28327b = vc0Var;
        this.f28328c = vc0Var2;
        this.d = vc0Var3;
    }

    @Override
    public final void s(vc0 vc0Var, int i10) {
        switch (this.f28326a) {
            case 0:
                e5.b(this.f28327b, this.f28328c, this.d);
                return;
            case 1:
                e5.y0(this.f28327b, this.f28328c, this.d);
                return;
            default:
                e5.y0(this.f28327b, this.f28328c, this.d);
                return;
        }
    }
}
