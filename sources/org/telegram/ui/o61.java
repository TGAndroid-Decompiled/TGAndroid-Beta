package org.telegram.ui;
public final class o61 extends f2.v {
    public final q61 f40992c;

    public o61(q61 q61Var) {
        this.f40992c = q61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        q61 q61Var = this.f40992c;
        org.telegram.ui.Components.iz izVar = q61Var.T;
        org.telegram.ui.Components.k51 k51Var = q61Var.Z;
        if (k51Var == null) {
            return izVar.J;
        }
        org.telegram.ui.Components.w41 G = k51Var.G(i10 - 1);
        if (G != null && (i11 = G.f34309u) != -1) {
            return i11;
        }
        return izVar.J;
    }
}
