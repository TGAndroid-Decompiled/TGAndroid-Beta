package org.telegram.ui.Components;
public final class oq0 extends g.o {
    public final int f31364c;
    public final mr0 d;

    public oq0(mr0 mr0Var, int i10) {
        this.f31364c = i10;
        this.d = mr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f31364c) {
            case 0:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            case 1:
                ir0 ir0Var = this.d.N;
                if (i10 != ir0Var.f29369w && i10 != ir0Var.f29370x && i10 != ir0Var.f29371y && i10 != ir0Var.F && ir0Var.j(i10) != 0) {
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
