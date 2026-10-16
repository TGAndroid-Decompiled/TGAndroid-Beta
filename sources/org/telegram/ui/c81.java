package org.telegram.ui;
public final class c81 extends g.o {
    public final e81 f34480c;

    public c81(e81 e81Var) {
        this.f34480c = e81Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        e81 e81Var = this.f34480c;
        org.telegram.ui.Components.zz zzVar = e81Var.X;
        org.telegram.ui.Components.a71 a71Var = e81Var.f35222d0;
        if (a71Var == null) {
            return zzVar.J;
        }
        org.telegram.ui.Components.m61 G = a71Var.G(i10 - 1);
        if (G != null && (i11 = G.f26955u) != -1) {
            return i11;
        }
        return zzVar.J;
    }
}
