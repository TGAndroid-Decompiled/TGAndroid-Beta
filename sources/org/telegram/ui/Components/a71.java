package org.telegram.ui.Components;
public final class a71 extends g.p {
    public final z61 f24482c;
    public final c71 d;

    public a71(c71 c71Var, z61 z61Var) {
        this.d = c71Var;
        this.f24482c = z61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        u61 u61Var = this.d.f25250f3;
        z61 z61Var = this.f24482c;
        if (u61Var == null) {
            return z61Var.J;
        }
        g61 G = u61Var.G(i10);
        if (G != null && (i11 = G.f26683u) != -1) {
            return i11;
        }
        return z61Var.J;
    }
}
