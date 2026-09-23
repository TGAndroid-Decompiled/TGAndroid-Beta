package org.telegram.ui;
public final class k71 extends g.p {
    public final m71 f34600c;

    public k71(m71 m71Var) {
        this.f34600c = m71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m71 m71Var = this.f34600c;
        org.telegram.ui.Components.oz ozVar = m71Var.X;
        org.telegram.ui.Components.v51 v51Var = m71Var.f35170d0;
        if (v51Var == null) {
            return ozVar.J;
        }
        org.telegram.ui.Components.h51 G = v51Var.G(i10 - 1);
        if (G != null && (i11 = G.f24516u) != -1) {
            return i11;
        }
        return ozVar.J;
    }
}
