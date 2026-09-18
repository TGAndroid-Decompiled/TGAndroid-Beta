package org.telegram.ui.Components;
public final class l0 implements bd0 {
    public final int f25972a;
    public final dd0 f25973b;
    public final dd0 f25974c;
    public final dd0 d;

    public l0(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, int i10) {
        this.f25972a = i10;
        this.f25973b = dd0Var;
        this.f25974c = dd0Var2;
        this.d = dd0Var3;
    }

    @Override
    public final void q(dd0 dd0Var, int i10) {
        switch (this.f25972a) {
            case 0:
                e5.b(this.f25973b, this.f25974c, this.d);
                return;
            case 1:
                e5.y0(this.f25973b, this.f25974c, this.d);
                return;
            default:
                e5.y0(this.f25973b, this.f25974c, this.d);
                return;
        }
    }
}
