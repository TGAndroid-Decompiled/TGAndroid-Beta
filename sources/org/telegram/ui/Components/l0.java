package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f28038a;
    public final od0 f28039b;
    public final od0 f28040c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f28038a = i10;
        this.f28039b = od0Var;
        this.f28040c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void q(od0 od0Var, int i10) {
        switch (this.f28038a) {
            case 0:
                f5.a(this.f28039b, this.f28040c, this.d);
                return;
            case 1:
                f5.x0(this.f28039b, this.f28040c, this.d);
                return;
            default:
                f5.x0(this.f28039b, this.f28040c, this.d);
                return;
        }
    }
}
