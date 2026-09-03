package org.telegram.ui;
public final class j71 extends f2.v {
    public final l71 f35104c;

    public j71(l71 l71Var) {
        this.f35104c = l71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l71 l71Var = this.f35104c;
        org.telegram.ui.Components.nz nzVar = l71Var.U;
        org.telegram.ui.Components.w51 w51Var = l71Var.f35671a0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f25594u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
