package org.telegram.ui;
public final class l71 extends g.p {
    public final n71 f35238c;

    public l71(n71 n71Var) {
        this.f35238c = n71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n71 n71Var = this.f35238c;
        org.telegram.ui.Components.pz pzVar = n71Var.X;
        org.telegram.ui.Components.l61 l61Var = n71Var.f35764d0;
        if (l61Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.x51 G = l61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30302u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
