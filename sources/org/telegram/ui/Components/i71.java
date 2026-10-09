package org.telegram.ui.Components;
public final class i71 extends g.o {
    public final h71 f27260c;
    public final k71 d;

    public i71(k71 k71Var, h71 h71Var) {
        this.d = k71Var;
        this.f27260c = h71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        c71 c71Var = this.d.W2;
        h71 h71Var = this.f27260c;
        if (c71Var == null) {
            return h71Var.J;
        }
        p61 G = c71Var.G(i10);
        if (G != null && (i11 = G.f29743u) != -1) {
            return i11;
        }
        return h71Var.J;
    }
}
