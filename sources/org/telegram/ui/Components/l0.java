package org.telegram.ui.Components;
public final class l0 implements ed0 {
    public final int f28309a;
    public final gd0 f28310b;
    public final gd0 f28311c;
    public final gd0 d;

    public l0(gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, int i10) {
        this.f28309a = i10;
        this.f28310b = gd0Var;
        this.f28311c = gd0Var2;
        this.d = gd0Var3;
    }

    @Override
    public final void q(gd0 gd0Var, int i10) {
        switch (this.f28309a) {
            case 0:
                e5.b(this.f28310b, this.f28311c, this.d);
                return;
            case 1:
                e5.y0(this.f28310b, this.f28311c, this.d);
                return;
            default:
                e5.y0(this.f28310b, this.f28311c, this.d);
                return;
        }
    }
}
