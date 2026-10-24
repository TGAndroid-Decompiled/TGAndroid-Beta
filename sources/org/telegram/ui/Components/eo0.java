package org.telegram.ui.Components;
public final class eo0 extends s4.o {
    public final io0 f26088b;

    public eo0(io0 io0Var) {
        this.f26088b = io0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        io0 io0Var = this.f26088b;
        return ((fo0) io0Var.f27456n.get(i10)).equals(io0Var.f27457r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        io0 io0Var = this.f26088b;
        if (((fo0) io0Var.f27456n.get(i10)).f26400a.h == ((fo0) io0Var.f27457r.get(i11)).f26400a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f26088b.f27457r.size();
    }

    @Override
    public final int e() {
        return this.f26088b.f27456n.size();
    }
}
