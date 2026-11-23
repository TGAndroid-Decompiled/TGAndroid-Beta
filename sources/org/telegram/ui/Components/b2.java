package org.telegram.ui.Components;
public final class b2 implements ob0 {
    public final int f33604a;
    public final qb0 f33605b;
    public final qb0 f33606c;
    public final qb0 d;

    public b2(qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, int i7) {
        this.f33604a = i7;
        this.f33605b = qb0Var;
        this.f33606c = qb0Var2;
        this.d = qb0Var3;
    }

    @Override
    public final void o(qb0 qb0Var, int i7) {
        switch (this.f33604a) {
            case 0:
                b5.v0(this.f33605b, this.f33606c, this.d);
                return;
            case 1:
                b5.v0(this.f33605b, this.f33606c, this.d);
                return;
            default:
                b5.b(this.f33605b, this.f33606c, this.d);
                return;
        }
    }
}
