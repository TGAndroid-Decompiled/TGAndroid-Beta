package org.telegram.ui.Components;
public final class r61 extends g.p {
    public final q61 f27837c;
    public final t61 d;

    public r61(t61 t61Var, q61 q61Var) {
        this.d = t61Var;
        this.f27837c = q61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l61 l61Var = this.d.Y2;
        q61 q61Var = this.f27837c;
        if (l61Var == null) {
            return q61Var.J;
        }
        x51 G = l61Var.G(i10);
        if (G != null && (i11 = G.f30257u) != -1) {
            return i11;
        }
        return q61Var.J;
    }
}
