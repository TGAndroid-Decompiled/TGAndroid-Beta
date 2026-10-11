package org.telegram.ui.Components;
public final class k71 extends g.o {
    public final j71 f27861c;
    public final m71 d;

    public k71(m71 m71Var, j71 j71Var) {
        this.d = m71Var;
        this.f27861c = j71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        e71 e71Var = this.d.W2;
        j71 j71Var = this.f27861c;
        if (e71Var == null) {
            return j71Var.J;
        }
        r61 G = e71Var.G(i10);
        if (G != null && (i11 = G.f30370u) != -1) {
            return i11;
        }
        return j71Var.J;
    }
}
