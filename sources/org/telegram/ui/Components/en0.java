package org.telegram.ui.Components;
public final class en0 extends s4.o {
    public final in0 f23728b;

    public en0(in0 in0Var) {
        this.f23728b = in0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        in0 in0Var = this.f23728b;
        return ((fn0) in0Var.f25008n.get(i10)).equals(in0Var.f25009r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        in0 in0Var = this.f23728b;
        if (((fn0) in0Var.f25008n.get(i10)).f24013a.h == ((fn0) in0Var.f25009r.get(i11)).f24013a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23728b.f25009r.size();
    }

    @Override
    public final int e() {
        return this.f23728b.f25008n.size();
    }
}
