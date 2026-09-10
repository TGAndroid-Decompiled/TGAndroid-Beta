package org.telegram.ui.Components;
public final class p61 extends g.p {
    public final o61 f26046c;
    public final r61 d;

    public p61(r61 r61Var, o61 o61Var) {
        this.d = r61Var;
        this.f26046c = o61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        j61 j61Var = this.d.Y2;
        o61 o61Var = this.f26046c;
        if (j61Var == null) {
            return o61Var.J;
        }
        v51 G = j61Var.G(i10);
        if (G != null && (i11 = G.f27838u) != -1) {
            return i11;
        }
        return o61Var.J;
    }
}
