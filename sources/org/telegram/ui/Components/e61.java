package org.telegram.ui.Components;
public final class e61 extends f2.v {
    public final d61 f24482c;
    public final g61 d;

    public e61(g61 g61Var, d61 d61Var) {
        this.d = g61Var;
        this.f24482c = d61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w51 w51Var = this.d.V2;
        d61 d61Var = this.f24482c;
        if (w51Var == null) {
            return d61Var.J;
        }
        i51 G = w51Var.G(i10);
        if (G != null && (i11 = G.f25574u) != -1) {
            return i11;
        }
        return d61Var.J;
    }
}
