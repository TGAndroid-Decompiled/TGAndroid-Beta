package org.telegram.ui.Components;
public final class q71 extends g.o {
    public final p71 f31820c;
    public final s71 d;

    public q71(s71 s71Var, p71 p71Var) {
        this.d = s71Var;
        this.f31820c = p71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k71 k71Var = this.d.f32504g3;
        p71 p71Var = this.f31820c;
        if (k71Var == null) {
            return p71Var.J;
        }
        u61 G = k71Var.G(i10);
        if (G != null && (i11 = G.f33258u) != -1) {
            return i11;
        }
        return p71Var.J;
    }
}
