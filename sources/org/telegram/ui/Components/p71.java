package org.telegram.ui.Components;
public final class p71 extends g.o {
    public final o71 f31466c;
    public final r71 d;

    public p71(r71 r71Var, o71 o71Var) {
        this.d = r71Var;
        this.f31466c = o71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        j71 j71Var = this.d.f32152g3;
        o71 o71Var = this.f31466c;
        if (j71Var == null) {
            return o71Var.J;
        }
        t61 G = j71Var.G(i10);
        if (G != null && (i11 = G.f32884u) != -1) {
            return i11;
        }
        return o71Var.J;
    }
}
