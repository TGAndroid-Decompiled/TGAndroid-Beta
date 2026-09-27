package org.telegram.ui;
public final class n71 extends g.p {
    public final p71 f35838c;

    public n71(p71 p71Var) {
        this.f35838c = p71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p71 p71Var = this.f35838c;
        org.telegram.ui.Components.pz pzVar = p71Var.X;
        org.telegram.ui.Components.l61 l61Var = p71Var.f36345d0;
        if (l61Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.x51 G = l61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30311u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
