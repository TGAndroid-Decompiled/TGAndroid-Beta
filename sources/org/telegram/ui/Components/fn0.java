package org.telegram.ui.Components;
public final class fn0 extends s4.o {
    public final jn0 f23966b;

    public fn0(jn0 jn0Var) {
        this.f23966b = jn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        jn0 jn0Var = this.f23966b;
        return ((gn0) jn0Var.f25359n.get(i10)).equals(jn0Var.f25360r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        jn0 jn0Var = this.f23966b;
        if (((gn0) jn0Var.f25359n.get(i10)).f24349a.h == ((gn0) jn0Var.f25360r.get(i11)).f24349a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23966b.f25360r.size();
    }

    @Override
    public final int e() {
        return this.f23966b.f25359n.size();
    }
}
