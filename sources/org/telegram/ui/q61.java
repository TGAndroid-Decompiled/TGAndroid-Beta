package org.telegram.ui;
public final class q61 extends g.o {
    public final s61 f42624c;

    public q61(s61 s61Var) {
        this.f42624c = s61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        s61 s61Var = this.f42624c;
        org.telegram.ui.Components.vz vzVar = s61Var.X;
        org.telegram.ui.Components.k71 k71Var = s61Var.f43248d0;
        if (k71Var == null) {
            return vzVar.J;
        }
        org.telegram.ui.Components.u61 G = k71Var.G(i10 - 1);
        if (G != null && (i11 = G.f33258u) != -1) {
            return i11;
        }
        return vzVar.J;
    }
}
