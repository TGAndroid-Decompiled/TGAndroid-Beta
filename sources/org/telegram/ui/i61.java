package org.telegram.ui;
public final class i61 extends g.o {
    public final k61 f37862c;

    public i61(k61 k61Var) {
        this.f37862c = k61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k61 k61Var = this.f37862c;
        org.telegram.ui.Components.wz wzVar = k61Var.X;
        org.telegram.ui.Components.t61 t61Var = k61Var.f38425d0;
        if (t61Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.g61 G = t61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26506u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
