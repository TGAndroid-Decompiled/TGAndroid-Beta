package org.telegram.ui.Components;
public final class t1 implements gb0 {
    public final int f38230a;
    public final ib0 f38231b;
    public final ib0 f38232c;
    public final ib0 d;

    public t1(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, int i7) {
        this.f38230a = i7;
        this.f38231b = ib0Var;
        this.f38232c = ib0Var2;
        this.d = ib0Var3;
    }

    @Override
    public final void n(ib0 ib0Var, int i7) {
        switch (this.f38230a) {
            case 0:
                v4.v0(this.f38231b, this.f38232c, this.d);
                return;
            case 1:
                v4.v0(this.f38231b, this.f38232c, this.d);
                return;
            default:
                v4.b(this.f38231b, this.f38232c, this.d);
                return;
        }
    }
}
