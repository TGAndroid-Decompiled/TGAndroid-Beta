package org.telegram.ui;
public final class l71 extends g.p {
    public final n71 f38248c;

    public l71(n71 n71Var) {
        this.f38248c = n71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n71 n71Var = this.f38248c;
        org.telegram.ui.Components.qz qzVar = n71Var.X;
        org.telegram.ui.Components.w61 w61Var = n71Var.f38827d0;
        if (w61Var == null) {
            return qzVar.J;
        }
        org.telegram.ui.Components.h61 G = w61Var.G(i10 - 1);
        if (G != null && (i11 = G.f27102u) != -1) {
            return i11;
        }
        return qzVar.J;
    }
}
