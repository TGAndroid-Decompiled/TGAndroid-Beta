package org.telegram.ui.Components;
public final class pq0 extends g.o {
    public final int f31704c;
    public final nr0 d;

    public pq0(nr0 nr0Var, int i10) {
        this.f31704c = i10;
        this.d = nr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f31704c) {
            case 0:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            case 1:
                jr0 jr0Var = this.d.N;
                if (i10 != jr0Var.f29754w && i10 != jr0Var.f29755x && i10 != jr0Var.f29756y && i10 != jr0Var.F && jr0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.J.J;
                }
                return 1;
        }
    }
}
