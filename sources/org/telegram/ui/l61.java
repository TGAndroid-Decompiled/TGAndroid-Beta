package org.telegram.ui;

public final class l61 extends f2.w {

    public final n61 f39959c;

    public l61(n61 n61Var) {
        this.f39959c = n61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n61 n61Var = this.f39959c;
        org.telegram.ui.Components.bz bzVar = n61Var.T;
        org.telegram.ui.Components.b51 b51Var = n61Var.Z;
        if (b51Var == null) {
            return bzVar.J;
        }
        org.telegram.ui.Components.n41 n41VarG = b51Var.G(i10 - 1);
        return (n41VarG == null || (i11 = n41VarG.f30853u) == -1) ? bzVar.J : i11;
    }
}
