package org.telegram.ui.Components;
public final class s61 extends g.p {
    public final r61 f28133c;
    public final u61 d;

    public s61(u61 u61Var, r61 r61Var) {
        this.d = u61Var;
        this.f28133c = r61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m61 m61Var = this.d.Y2;
        r61 r61Var = this.f28133c;
        if (m61Var == null) {
            return r61Var.J;
        }
        y51 G = m61Var.G(i10);
        if (G != null && (i11 = G.f30527u) != -1) {
            return i11;
        }
        return r61Var.J;
    }
}
