package org.telegram.ui.Components;
public final class po0 extends s4.o {
    public final to0 f29559b;

    public po0(to0 to0Var) {
        this.f29559b = to0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        to0 to0Var = this.f29559b;
        return ((qo0) to0Var.f30910n.get(i10)).equals(to0Var.f30911r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        to0 to0Var = this.f29559b;
        if (((qo0) to0Var.f30910n.get(i10)).f29873a.h == ((qo0) to0Var.f30911r.get(i11)).f29873a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29559b.f30911r.size();
    }

    @Override
    public final int e() {
        return this.f29559b.f30910n.size();
    }
}
