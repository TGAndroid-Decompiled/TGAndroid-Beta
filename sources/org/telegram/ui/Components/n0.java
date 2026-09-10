package org.telegram.ui.Components;
public final class n0 implements bd0 {
    public final int f25346a;
    public final dd0 f25347b;
    public final dd0 f25348c;
    public final dd0 d;

    public n0(dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, int i10) {
        this.f25346a = i10;
        this.f25347b = dd0Var;
        this.f25348c = dd0Var2;
        this.d = dd0Var3;
    }

    @Override
    public final void q(dd0 dd0Var, int i10) {
        switch (this.f25346a) {
            case 0:
                d5.b(this.f25347b, this.f25348c, this.d);
                return;
            case 1:
                d5.y0(this.f25347b, this.f25348c, this.d);
                return;
            default:
                d5.y0(this.f25347b, this.f25348c, this.d);
                return;
        }
    }
}
