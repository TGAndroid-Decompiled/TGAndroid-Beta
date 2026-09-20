package org.telegram.ui.Components;
public final class q61 extends g.p {
    public final p61 f27526c;
    public final s61 d;

    public q61(s61 s61Var, p61 p61Var) {
        this.d = s61Var;
        this.f27526c = p61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k61 k61Var = this.d.Y2;
        p61 p61Var = this.f27526c;
        if (k61Var == null) {
            return p61Var.J;
        }
        w51 G = k61Var.G(i10);
        if (G != null && (i11 = G.f29957u) != -1) {
            return i11;
        }
        return p61Var.J;
    }
}
