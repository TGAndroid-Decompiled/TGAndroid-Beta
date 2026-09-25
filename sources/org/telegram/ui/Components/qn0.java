package org.telegram.ui.Components;
public final class qn0 extends s4.o {
    public final un0 f27715b;

    public qn0(un0 un0Var) {
        this.f27715b = un0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        un0 un0Var = this.f27715b;
        return ((rn0) un0Var.f28845n.get(i10)).equals(un0Var.f28846r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        un0 un0Var = this.f27715b;
        if (((rn0) un0Var.f28845n.get(i10)).f28012a.h == ((rn0) un0Var.f28846r.get(i11)).f28012a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27715b.f28846r.size();
    }

    @Override
    public final int e() {
        return this.f27715b.f28845n.size();
    }
}
