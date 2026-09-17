package org.telegram.ui.Components;
public final class d61 extends g.p {
    public final c61 f23219c;
    public final f61 d;

    public d61(f61 f61Var, c61 c61Var) {
        this.d = f61Var;
        this.f23219c = c61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        x51 x51Var = this.d.Y2;
        c61 c61Var = this.f23219c;
        if (x51Var == null) {
            return c61Var.J;
        }
        j51 G = x51Var.G(i10);
        if (G != null && (i11 = G.f25133u) != -1) {
            return i11;
        }
        return c61Var.J;
    }
}
