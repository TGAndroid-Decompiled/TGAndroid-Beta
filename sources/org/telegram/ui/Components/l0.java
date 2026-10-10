package org.telegram.ui.Components;
public final class l0 implements td0 {
    public final int f28128a;
    public final vd0 f28129b;
    public final vd0 f28130c;
    public final vd0 d;

    public l0(vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3, int i10) {
        this.f28128a = i10;
        this.f28129b = vd0Var;
        this.f28130c = vd0Var2;
        this.d = vd0Var3;
    }

    @Override
    public final void r(vd0 vd0Var, int i10) {
        switch (this.f28128a) {
            case 0:
                g5.a(this.f28129b, this.f28130c, this.d);
                return;
            case 1:
                g5.x0(this.f28129b, this.f28130c, this.d);
                return;
            default:
                g5.x0(this.f28129b, this.f28130c, this.d);
                return;
        }
    }
}
