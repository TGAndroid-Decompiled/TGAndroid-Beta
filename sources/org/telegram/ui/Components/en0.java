package org.telegram.ui.Components;
public final class en0 extends s4.o {
    public final in0 f23698b;

    public en0(in0 in0Var) {
        this.f23698b = in0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        in0 in0Var = this.f23698b;
        return ((fn0) in0Var.f25087n.get(i10)).equals(in0Var.f25088r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        in0 in0Var = this.f23698b;
        if (((fn0) in0Var.f25087n.get(i10)).f24022a.h == ((fn0) in0Var.f25088r.get(i11)).f24022a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23698b.f25088r.size();
    }

    @Override
    public final int e() {
        return this.f23698b.f25087n.size();
    }
}
