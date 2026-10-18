package org.telegram.ui.Components;
public final class bo0 extends s4.o {
    public final fo0 f25016b;

    public bo0(fo0 fo0Var) {
        this.f25016b = fo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        fo0 fo0Var = this.f25016b;
        return ((co0) fo0Var.f26324n.get(i10)).equals(fo0Var.f26325r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        fo0 fo0Var = this.f25016b;
        if (((co0) fo0Var.f26324n.get(i10)).f25313a.h == ((co0) fo0Var.f26325r.get(i11)).f25313a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25016b.f26325r.size();
    }

    @Override
    public final int e() {
        return this.f25016b.f26324n.size();
    }
}
