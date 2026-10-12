package org.telegram.ui.Components;
public final class f71 extends g.o {
    public final e71 f24953c;
    public final h71 d;

    public f71(h71 h71Var, e71 e71Var) {
        this.d = h71Var;
        this.f24953c = e71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        z61 z61Var = this.d.W2;
        e71 e71Var = this.f24953c;
        if (z61Var == null) {
            return e71Var.J;
        }
        l61 G = z61Var.G(i10);
        if (G != null && (i11 = G.f26963u) != -1) {
            return i11;
        }
        return e71Var.J;
    }
}
