package org.telegram.ui.Components;
public final class e61 extends f2.v {
    public final d61 f26462c;
    public final h61 d;

    public e61(h61 h61Var, d61 d61Var) {
        this.d = h61Var;
        this.f26462c = d61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w51 w51Var = this.d.V2;
        d61 d61Var = this.f26462c;
        if (w51Var == null) {
            return d61Var.J;
        }
        h51 G = w51Var.G(i10);
        if (G != null && (i11 = G.f27384u) != -1) {
            return i11;
        }
        return d61Var.J;
    }
}
