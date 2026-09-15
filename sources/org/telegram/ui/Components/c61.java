package org.telegram.ui.Components;
public final class c61 extends g.p {
    public final b61 f22964c;
    public final e61 d;

    public c61(e61 e61Var, b61 b61Var) {
        this.d = e61Var;
        this.f22964c = b61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w51 w51Var = this.d.Y2;
        b61 b61Var = this.f22964c;
        if (w51Var == null) {
            return b61Var.J;
        }
        i51 G = w51Var.G(i10);
        if (G != null && (i11 = G.f24903u) != -1) {
            return i11;
        }
        return b61Var.J;
    }
}
