package org.telegram.ui.Components;
public final class b61 extends g.p {
    public final a61 f24591c;
    public final d61 d;

    public b61(d61 d61Var, a61 a61Var) {
        this.d = d61Var;
        this.f24591c = a61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        v51 v51Var = this.d.Y2;
        a61 a61Var = this.f24591c;
        if (v51Var == null) {
            return a61Var.J;
        }
        h51 G = v51Var.G(i10);
        if (G != null && (i11 = G.f26630u) != -1) {
            return i11;
        }
        return a61Var.J;
    }
}
