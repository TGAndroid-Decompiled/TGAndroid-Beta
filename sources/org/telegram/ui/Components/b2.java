package org.telegram.ui.Components;
public final class b2 implements qb0 {
    public final int f33508a;
    public final sb0 f33509b;
    public final sb0 f33510c;
    public final sb0 d;

    public b2(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, int i7) {
        this.f33508a = i7;
        this.f33509b = sb0Var;
        this.f33510c = sb0Var2;
        this.d = sb0Var3;
    }

    @Override
    public final void n(sb0 sb0Var, int i7) {
        switch (this.f33508a) {
            case 0:
                b5.v0(this.f33509b, this.f33510c, this.d);
                return;
            case 1:
                b5.v0(this.f33509b, this.f33510c, this.d);
                return;
            default:
                b5.b(this.f33509b, this.f33510c, this.d);
                return;
        }
    }
}
