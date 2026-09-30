package org.telegram.ui;
public final class l71 extends g.p {
    public final n71 f35328c;

    public l71(n71 n71Var) {
        this.f35328c = n71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n71 n71Var = this.f35328c;
        org.telegram.ui.Components.qz qzVar = n71Var.X;
        org.telegram.ui.Components.m61 m61Var = n71Var.f35874d0;
        if (m61Var == null) {
            return qzVar.J;
        }
        org.telegram.ui.Components.y51 G = m61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30646u) != -1) {
            return i11;
        }
        return qzVar.J;
    }
}
