package org.telegram.ui.Components;
public final class r1 implements gb0 {
    public final int f38817a;
    public final ib0 f38818b;
    public final ib0 f38819c;
    public final ib0 d;

    public r1(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, int i7) {
        this.f38817a = i7;
        this.f38818b = ib0Var;
        this.f38819c = ib0Var2;
        this.d = ib0Var3;
    }

    @Override
    public final void m(ib0 ib0Var, int i7) {
        switch (this.f38817a) {
            case 0:
                t4.v0(this.f38818b, this.f38819c, this.d);
                return;
            case 1:
                t4.v0(this.f38818b, this.f38819c, this.d);
                return;
            default:
                t4.b(this.f38818b, this.f38819c, this.d);
                return;
        }
    }
}
