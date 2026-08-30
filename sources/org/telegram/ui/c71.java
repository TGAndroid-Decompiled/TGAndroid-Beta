package org.telegram.ui;
public final class c71 extends f2.v {
    public final e71 f33213c;

    public c71(e71 e71Var) {
        this.f33213c = e71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        e71 e71Var = this.f33213c;
        org.telegram.ui.Components.nz nzVar = e71Var.U;
        org.telegram.ui.Components.w51 w51Var = e71Var.f33925a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f25574u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
