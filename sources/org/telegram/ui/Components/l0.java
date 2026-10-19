package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f28036a;
    public final od0 f28037b;
    public final od0 f28038c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f28036a = i10;
        this.f28037b = od0Var;
        this.f28038c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void q(od0 od0Var, int i10) {
        switch (this.f28036a) {
            case 0:
                f5.a(this.f28037b, this.f28038c, this.d);
                return;
            case 1:
                f5.x0(this.f28037b, this.f28038c, this.d);
                return;
            default:
                f5.x0(this.f28037b, this.f28038c, this.d);
                return;
        }
    }
}
