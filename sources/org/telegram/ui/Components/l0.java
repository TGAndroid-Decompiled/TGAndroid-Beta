package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f28042a;
    public final od0 f28043b;
    public final od0 f28044c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f28042a = i10;
        this.f28043b = od0Var;
        this.f28044c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void q(od0 od0Var, int i10) {
        switch (this.f28042a) {
            case 0:
                f5.a(this.f28043b, this.f28044c, this.d);
                return;
            case 1:
                f5.x0(this.f28043b, this.f28044c, this.d);
                return;
            default:
                f5.x0(this.f28043b, this.f28044c, this.d);
                return;
        }
    }
}
