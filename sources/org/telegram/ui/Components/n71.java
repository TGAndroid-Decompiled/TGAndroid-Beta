package org.telegram.ui.Components;
public final class n71 extends g.o {
    public final m71 f28750c;
    public final p71 d;

    public n71(p71 p71Var, m71 m71Var) {
        this.d = p71Var;
        this.f28750c = m71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        h71 h71Var = this.d.W2;
        m71 m71Var = this.f28750c;
        if (h71Var == null) {
            return m71Var.J;
        }
        u61 G = h71Var.G(i10);
        if (G != null && (i11 = G.f31085u) != -1) {
            return i11;
        }
        return m71Var.J;
    }
}
