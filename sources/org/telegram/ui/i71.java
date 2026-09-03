package org.telegram.ui;
public final class i71 extends f2.v {
    public final k71 f37568c;

    public i71(k71 k71Var) {
        this.f37568c = k71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k71 k71Var = this.f37568c;
        org.telegram.ui.Components.pz pzVar = k71Var.U;
        org.telegram.ui.Components.w51 w51Var = k71Var.f38203a0;
        if (w51Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.h51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f27384u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
