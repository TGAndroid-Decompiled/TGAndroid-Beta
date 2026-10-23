package org.telegram.ui;
public final class m61 extends g.o {
    public final o61 f39384c;

    public m61(o61 o61Var) {
        this.f39384c = o61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o61 o61Var = this.f39384c;
        org.telegram.ui.Components.wz wzVar = o61Var.X;
        org.telegram.ui.Components.b71 b71Var = o61Var.f40085d0;
        if (b71Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.m61 G = b71Var.G(i10 - 1);
        if (G != null && (i11 = G.f28568u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
