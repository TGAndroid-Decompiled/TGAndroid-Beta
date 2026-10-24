package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f28122a;
    public final od0 f28123b;
    public final od0 f28124c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f28122a = i10;
        this.f28123b = od0Var;
        this.f28124c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void n(od0 od0Var, int i10) {
        switch (this.f28122a) {
            case 0:
                d5.b(this.f28123b, this.f28124c, this.d);
                return;
            case 1:
                d5.x0(this.f28123b, this.f28124c, this.d);
                return;
            default:
                d5.x0(this.f28123b, this.f28124c, this.d);
                return;
        }
    }
}
