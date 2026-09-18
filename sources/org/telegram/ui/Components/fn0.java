package org.telegram.ui.Components;
public final class fn0 extends s4.o {
    public final jn0 f23969b;

    public fn0(jn0 jn0Var) {
        this.f23969b = jn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        jn0 jn0Var = this.f23969b;
        return ((gn0) jn0Var.f25362n.get(i10)).equals(jn0Var.f25363r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        jn0 jn0Var = this.f23969b;
        if (((gn0) jn0Var.f25362n.get(i10)).f24352a.h == ((gn0) jn0Var.f25363r.get(i11)).f24352a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f23969b.f25363r.size();
    }

    @Override
    public final int e() {
        return this.f23969b.f25362n.size();
    }
}
