package org.telegram.ui.Components;
public final class m0 implements tc0 {
    public final int f28352a;
    public final vc0 f28353b;
    public final vc0 f28354c;
    public final vc0 d;

    public m0(vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, int i10) {
        this.f28352a = i10;
        this.f28353b = vc0Var;
        this.f28354c = vc0Var2;
        this.d = vc0Var3;
    }

    @Override
    public final void s(vc0 vc0Var, int i10) {
        switch (this.f28352a) {
            case 0:
                e5.b(this.f28353b, this.f28354c, this.d);
                return;
            case 1:
                e5.y0(this.f28353b, this.f28354c, this.d);
                return;
            default:
                e5.y0(this.f28353b, this.f28354c, this.d);
                return;
        }
    }
}
