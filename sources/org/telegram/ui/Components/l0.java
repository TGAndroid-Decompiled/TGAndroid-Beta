package org.telegram.ui.Components;
public final class l0 implements ed0 {
    public final int f25874a;
    public final gd0 f25875b;
    public final gd0 f25876c;
    public final gd0 d;

    public l0(gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, int i10) {
        this.f25874a = i10;
        this.f25875b = gd0Var;
        this.f25876c = gd0Var2;
        this.d = gd0Var3;
    }

    @Override
    public final void q(gd0 gd0Var, int i10) {
        switch (this.f25874a) {
            case 0:
                e5.b(this.f25875b, this.f25876c, this.d);
                return;
            case 1:
                e5.y0(this.f25875b, this.f25876c, this.d);
                return;
            default:
                e5.y0(this.f25875b, this.f25876c, this.d);
                return;
        }
    }
}
