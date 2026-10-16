package org.telegram.ui.Components;
public final class g71 extends g.o {
    public final f71 f24898c;
    public final i71 d;

    public g71(i71 i71Var, f71 f71Var) {
        this.d = i71Var;
        this.f24898c = f71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        a71 a71Var = this.d.W2;
        f71 f71Var = this.f24898c;
        if (a71Var == null) {
            return f71Var.J;
        }
        m61 G = a71Var.G(i10);
        if (G != null && (i11 = G.f26955u) != -1) {
            return i11;
        }
        return f71Var.J;
    }
}
