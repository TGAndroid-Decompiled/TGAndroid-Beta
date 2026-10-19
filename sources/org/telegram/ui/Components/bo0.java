package org.telegram.ui.Components;
public final class bo0 extends s4.o {
    public final fo0 f24998b;

    public bo0(fo0 fo0Var) {
        this.f24998b = fo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        fo0 fo0Var = this.f24998b;
        return ((co0) fo0Var.f26309n.get(i10)).equals(fo0Var.f26310r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        fo0 fo0Var = this.f24998b;
        if (((co0) fo0Var.f26309n.get(i10)).f25289a.h == ((co0) fo0Var.f26310r.get(i11)).f25289a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f24998b.f26310r.size();
    }

    @Override
    public final int e() {
        return this.f24998b.f26309n.size();
    }
}
