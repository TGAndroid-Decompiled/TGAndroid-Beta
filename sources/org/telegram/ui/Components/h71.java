package org.telegram.ui.Components;
public final class h71 extends g.o {
    public final g71 f26814c;
    public final j71 d;

    public h71(j71 j71Var, g71 g71Var) {
        this.d = j71Var;
        this.f26814c = g71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        b71 b71Var = this.d.Z2;
        g71 g71Var = this.f26814c;
        if (b71Var == null) {
            return g71Var.J;
        }
        m61 G = b71Var.G(i10);
        if (G != null && (i11 = G.f28568u) != -1) {
            return i11;
        }
        return g71Var.J;
    }
}
