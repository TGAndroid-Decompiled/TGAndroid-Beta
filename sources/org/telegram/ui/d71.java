package org.telegram.ui;
public final class d71 extends f2.v {
    public final f71 f36129c;

    public d71(f71 f71Var) {
        this.f36129c = f71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        f71 f71Var = this.f36129c;
        org.telegram.ui.Components.pz pzVar = f71Var.U;
        org.telegram.ui.Components.x51 x51Var = f71Var.f36782a0;
        if (x51Var == null) {
            return pzVar.J;
        }
        org.telegram.ui.Components.j51 G = x51Var.G(i10 - 1);
        if (G != null && (i11 = G.f28023u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
