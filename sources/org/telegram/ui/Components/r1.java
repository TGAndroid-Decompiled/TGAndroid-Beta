package org.telegram.ui.Components;
public final class r1 implements gb0 {
    public final int f38815a;
    public final ib0 f38816b;
    public final ib0 f38817c;
    public final ib0 d;

    public r1(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, int i7) {
        this.f38815a = i7;
        this.f38816b = ib0Var;
        this.f38817c = ib0Var2;
        this.d = ib0Var3;
    }

    @Override
    public final void m(ib0 ib0Var, int i7) {
        switch (this.f38815a) {
            case 0:
                t4.v0(this.f38816b, this.f38817c, this.d);
                return;
            case 1:
                t4.v0(this.f38816b, this.f38817c, this.d);
                return;
            default:
                t4.b(this.f38816b, this.f38817c, this.d);
                return;
        }
    }
}
