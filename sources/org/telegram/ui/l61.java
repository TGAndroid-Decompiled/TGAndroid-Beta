package org.telegram.ui;
public final class l61 extends g.o {
    public final n61 f39119c;

    public l61(n61 n61Var) {
        this.f39119c = n61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n61 n61Var = this.f39119c;
        org.telegram.ui.Components.uz uzVar = n61Var.X;
        org.telegram.ui.Components.a71 a71Var = n61Var.f39748d0;
        if (a71Var == null) {
            return uzVar.J;
        }
        org.telegram.ui.Components.l61 G = a71Var.G(i10 - 1);
        if (G != null && (i11 = G.f28236u) != -1) {
            return i11;
        }
        return uzVar.J;
    }
}
