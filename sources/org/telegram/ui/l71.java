package org.telegram.ui;
public final class l71 extends g.p {
    public final n71 f35236c;

    public l71(n71 n71Var) {
        this.f35236c = n71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n71 n71Var = this.f35236c;
        org.telegram.ui.Components.pz pzVar = n71Var.X;
        org.telegram.ui.Components.k61 k61Var = n71Var.f35762d0;
        if (k61Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.w51 G = k61Var.G(i10 - 1);
        if (G != null && (i11 = G.f29904u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
