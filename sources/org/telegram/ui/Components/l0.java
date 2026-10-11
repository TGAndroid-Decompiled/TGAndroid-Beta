package org.telegram.ui.Components;
public final class l0 implements td0 {
    public final int f28130a;
    public final vd0 f28131b;
    public final vd0 f28132c;
    public final vd0 d;

    public l0(vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3, int i10) {
        this.f28130a = i10;
        this.f28131b = vd0Var;
        this.f28132c = vd0Var2;
        this.d = vd0Var3;
    }

    @Override
    public final void q(vd0 vd0Var, int i10) {
        switch (this.f28130a) {
            case 0:
                g5.a(this.f28131b, this.f28132c, this.d);
                return;
            case 1:
                g5.x0(this.f28131b, this.f28132c, this.d);
                return;
            default:
                g5.x0(this.f28131b, this.f28132c, this.d);
                return;
        }
    }
}
