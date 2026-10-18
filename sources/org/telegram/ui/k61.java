package org.telegram.ui;
public final class k61 extends g.o {
    public final m61 f38400c;

    public k61(m61 m61Var) {
        this.f38400c = m61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m61 m61Var = this.f38400c;
        org.telegram.ui.Components.wz wzVar = m61Var.X;
        org.telegram.ui.Components.s61 s61Var = m61Var.f38999d0;
        if (s61Var == null) {
            return wzVar.J;
        }
        org.telegram.ui.Components.f61 G = s61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26149u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
