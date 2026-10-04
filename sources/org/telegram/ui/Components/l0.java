package org.telegram.ui.Components;
public final class l0 implements ed0 {
    public final int f28214a;
    public final gd0 f28215b;
    public final gd0 f28216c;
    public final gd0 d;

    public l0(gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, int i10) {
        this.f28214a = i10;
        this.f28215b = gd0Var;
        this.f28216c = gd0Var2;
        this.d = gd0Var3;
    }

    @Override
    public final void q(gd0 gd0Var, int i10) {
        switch (this.f28214a) {
            case 0:
                e5.b(this.f28215b, this.f28216c, this.d);
                return;
            case 1:
                e5.y0(this.f28215b, this.f28216c, this.d);
                return;
            default:
                e5.y0(this.f28215b, this.f28216c, this.d);
                return;
        }
    }
}
