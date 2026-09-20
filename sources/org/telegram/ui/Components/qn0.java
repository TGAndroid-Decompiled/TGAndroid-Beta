package org.telegram.ui.Components;
public final class qn0 extends s4.o {
    public final un0 f27618b;

    public qn0(un0 un0Var) {
        this.f27618b = un0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        un0 un0Var = this.f27618b;
        return ((rn0) un0Var.f28780n.get(i10)).equals(un0Var.f28781r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        un0 un0Var = this.f27618b;
        if (((rn0) un0Var.f28780n.get(i10)).f27928a.h == ((rn0) un0Var.f28781r.get(i11)).f27928a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f27618b.f28781r.size();
    }

    @Override
    public final int e() {
        return this.f27618b.f28780n.size();
    }
}
