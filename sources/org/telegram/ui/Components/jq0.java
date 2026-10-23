package org.telegram.ui.Components;
public final class jq0 extends g.o {
    public final int f27741c;
    public final ir0 d;

    public jq0(ir0 ir0Var, int i10) {
        this.f27741c = i10;
        this.d = ir0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27741c) {
            case 0:
                if (i10 == 0) {
                    return this.d.J.J;
                }
                return 1;
            case 1:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            default:
                er0 er0Var = this.d.N;
                if (i10 != er0Var.f26058w && i10 != er0Var.f26059x && i10 != er0Var.f26060y && i10 != er0Var.F && er0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
        }
    }
}
