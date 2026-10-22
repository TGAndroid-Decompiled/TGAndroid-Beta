package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f27996a;
    public final od0 f27997b;
    public final od0 f27998c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f27996a = i10;
        this.f27997b = od0Var;
        this.f27998c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void q(od0 od0Var, int i10) {
        switch (this.f27996a) {
            case 0:
                f5.a(this.f27997b, this.f27998c, this.d);
                return;
            case 1:
                f5.x0(this.f27997b, this.f27998c, this.d);
                return;
            default:
                f5.x0(this.f27997b, this.f27998c, this.d);
                return;
        }
    }
}
