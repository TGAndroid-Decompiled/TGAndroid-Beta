package org.telegram.ui.Components;
public final class c71 extends g.p {
    public final b71 f25289c;
    public final e71 d;

    public c71(e71 e71Var, b71 b71Var) {
        this.d = e71Var;
        this.f25289c = b71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w61 w61Var = this.d.f26034f3;
        b71 b71Var = this.f25289c;
        if (w61Var == null) {
            return b71Var.J;
        }
        h61 G = w61Var.G(i10);
        if (G != null && (i11 = G.f27102u) != -1) {
            return i11;
        }
        return b71Var.J;
    }
}
