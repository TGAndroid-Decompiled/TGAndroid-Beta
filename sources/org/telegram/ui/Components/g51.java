package org.telegram.ui.Components;
public final class g51 extends f2.x {
    public final f51 f28655c;
    public final i51 d;

    public g51(i51 i51Var, f51 f51Var) {
        this.d = i51Var;
        this.f28655c = f51Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        z41 z41Var = this.d.U2;
        f51 f51Var = this.f28655c;
        if (z41Var == null) {
            return f51Var.J;
        }
        l41 G = z41Var.G(i9);
        if (G != null && (i10 = G.f30348u) != -1) {
            return i10;
        }
        return f51Var.J;
    }
}
