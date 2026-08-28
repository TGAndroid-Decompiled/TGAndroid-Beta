package org.telegram.ui;
public final class m61 extends f2.x {
    public final o61 f40340c;

    public m61(o61 o61Var) {
        this.f40340c = o61Var;
    }

    @Override
    public final int i(int i9) {
        int i10;
        o61 o61Var = this.f40340c;
        org.telegram.ui.Components.zy zyVar = o61Var.T;
        org.telegram.ui.Components.z41 z41Var = o61Var.Z;
        if (z41Var == null) {
            return zyVar.J;
        }
        org.telegram.ui.Components.l41 G = z41Var.G(i9 - 1);
        if (G != null && (i10 = G.f30348u) != -1) {
            return i10;
        }
        return zyVar.J;
    }
}
