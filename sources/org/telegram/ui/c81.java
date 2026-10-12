package org.telegram.ui;
public final class c81 extends g.o {
    public final e81 f34758c;

    public c81(e81 e81Var) {
        this.f34758c = e81Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        e81 e81Var = this.f34758c;
        org.telegram.ui.Components.zz zzVar = e81Var.X;
        org.telegram.ui.Components.z61 z61Var = e81Var.f35484d0;
        if (z61Var == null) {
            return zzVar.J;
        }
        org.telegram.ui.Components.l61 G = z61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26963u) != -1) {
            return i11;
        }
        return zzVar.J;
    }
}
