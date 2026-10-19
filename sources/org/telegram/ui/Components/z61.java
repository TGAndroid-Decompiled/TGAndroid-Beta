package org.telegram.ui.Components;
public final class z61 extends g.o {
    public final y61 f32867c;
    public final b71 d;

    public z61(b71 b71Var, y61 y61Var) {
        this.d = b71Var;
        this.f32867c = y61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        t61 t61Var = this.d.W2;
        y61 y61Var = this.f32867c;
        if (t61Var == null) {
            return y61Var.J;
        }
        g61 G = t61Var.G(i10);
        if (G != null && (i11 = G.f26506u) != -1) {
            return i11;
        }
        return y61Var.J;
    }
}
