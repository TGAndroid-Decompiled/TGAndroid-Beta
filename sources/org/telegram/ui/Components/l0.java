package org.telegram.ui.Components;
public final class l0 implements ed0 {
    public final int f25861a;
    public final gd0 f25862b;
    public final gd0 f25863c;
    public final gd0 d;

    public l0(gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, int i10) {
        this.f25861a = i10;
        this.f25862b = gd0Var;
        this.f25863c = gd0Var2;
        this.d = gd0Var3;
    }

    @Override
    public final void q(gd0 gd0Var, int i10) {
        switch (this.f25861a) {
            case 0:
                e5.b(this.f25862b, this.f25863c, this.d);
                return;
            case 1:
                e5.y0(this.f25862b, this.f25863c, this.d);
                return;
            default:
                e5.y0(this.f25862b, this.f25863c, this.d);
                return;
        }
    }
}
