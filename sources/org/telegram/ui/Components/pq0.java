package org.telegram.ui.Components;
public final class pq0 extends g.o {
    public final int f29923c;
    public final mr0 d;

    public pq0(mr0 mr0Var, int i10) {
        this.f29923c = i10;
        this.d = mr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f29923c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                ir0 ir0Var = this.d.M;
                if (i10 != ir0Var.f27474w && i10 != ir0Var.f27475x && i10 != ir0Var.f27476y && i10 != ir0Var.F && ir0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
