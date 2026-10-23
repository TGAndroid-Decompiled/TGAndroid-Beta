package org.telegram.ui;
public final class i61 extends g.o {
    public final k61 f37873c;

    public i61(k61 k61Var) {
        this.f37873c = k61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k61 k61Var = this.f37873c;
        org.telegram.ui.Components.wz wzVar = k61Var.X;
        org.telegram.ui.Components.u61 u61Var = k61Var.f38436d0;
        if (u61Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.h61 G = u61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26795u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
