package org.telegram.ui.Components;
public final class l0 implements rc0 {
    public final int f25730a;
    public final tc0 f25731b;
    public final tc0 f25732c;
    public final tc0 d;

    public l0(tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, int i10) {
        this.f25730a = i10;
        this.f25731b = tc0Var;
        this.f25732c = tc0Var2;
        this.d = tc0Var3;
    }

    @Override
    public final void q(tc0 tc0Var, int i10) {
        switch (this.f25730a) {
            case 0:
                e5.b(this.f25731b, this.f25732c, this.d);
                return;
            case 1:
                e5.y0(this.f25731b, this.f25732c, this.d);
                return;
            default:
                e5.y0(this.f25731b, this.f25732c, this.d);
                return;
        }
    }
}
