package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f27993a;
    public final od0 f27994b;
    public final od0 f27995c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f27993a = i10;
        this.f27994b = od0Var;
        this.f27995c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void q(od0 od0Var, int i10) {
        switch (this.f27993a) {
            case 0:
                f5.a(this.f27994b, this.f27995c, this.d);
                return;
            case 1:
                f5.x0(this.f27994b, this.f27995c, this.d);
                return;
            default:
                f5.x0(this.f27994b, this.f27995c, this.d);
                return;
        }
    }
}
