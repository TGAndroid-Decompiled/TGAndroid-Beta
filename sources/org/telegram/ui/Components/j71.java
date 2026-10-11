package org.telegram.ui.Components;
public final class j71 extends g.o {
    public final i71 f27636c;
    public final l71 d;

    public j71(l71 l71Var, i71 i71Var) {
        this.d = l71Var;
        this.f27636c = i71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        d71 d71Var = this.d.W2;
        i71 i71Var = this.f27636c;
        if (d71Var == null) {
            return i71Var.J;
        }
        q61 G = d71Var.G(i10);
        if (G != null && (i11 = G.f30176u) != -1) {
            return i11;
        }
        return i71Var.J;
    }
}
