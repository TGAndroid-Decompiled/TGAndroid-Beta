package org.telegram.ui;
public final class n71 extends g.p {
    public final p71 f38838c;

    public n71(p71 p71Var) {
        this.f38838c = p71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p71 p71Var = this.f38838c;
        org.telegram.ui.Components.qz qzVar = p71Var.X;
        org.telegram.ui.Components.u61 u61Var = p71Var.f39363d0;
        if (u61Var == null) {
            return qzVar.J;
        }
        org.telegram.ui.Components.g61 G = u61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26677u) != -1) {
            return i11;
        }
        return qzVar.J;
    }
}
