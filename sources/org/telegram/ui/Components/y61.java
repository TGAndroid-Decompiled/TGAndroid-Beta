package org.telegram.ui.Components;
public final class y61 extends g.o {
    public final x61 f32558c;
    public final a71 d;

    public y61(a71 a71Var, x61 x61Var) {
        this.d = a71Var;
        this.f32558c = x61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        s61 s61Var = this.d.W2;
        x61 x61Var = this.f32558c;
        if (s61Var == null) {
            return x61Var.J;
        }
        f61 G = s61Var.G(i10);
        if (G != null && (i11 = G.f26156u) != -1) {
            return i11;
        }
        return x61Var.J;
    }
}
