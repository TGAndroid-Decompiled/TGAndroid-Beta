package org.telegram.ui.Components;

public final class i51 extends f2.w {

    public final h51 f29237c;
    public final k51 d;

    public i51(k51 k51Var, h51 h51Var) {
        this.d = k51Var;
        this.f29237c = h51Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        b51 b51Var = this.d.U2;
        h51 h51Var = this.f29237c;
        if (b51Var == null) {
            return h51Var.J;
        }
        n41 n41VarG = b51Var.G(i10);
        return (n41VarG == null || (i11 = n41VarG.f30853u) == -1) ? h51Var.J : i11;
    }
}
