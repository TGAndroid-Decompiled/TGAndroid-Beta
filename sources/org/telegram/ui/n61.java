package org.telegram.ui;
public final class n61 extends g.o {
    public final p61 f41764c;

    public n61(p61 p61Var) {
        this.f41764c = p61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p61 p61Var = this.f41764c;
        org.telegram.ui.Components.vz vzVar = p61Var.X;
        org.telegram.ui.Components.j71 j71Var = p61Var.f42379d0;
        if (j71Var == null) {
            return vzVar.J;
        }
        org.telegram.ui.Components.t61 G = j71Var.G(i10 - 1);
        if (G != null && (i11 = G.f32884u) != -1) {
            return i11;
        }
        return vzVar.J;
    }
}
