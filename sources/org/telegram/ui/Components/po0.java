package org.telegram.ui.Components;
public final class po0 extends s4.o {
    public final to0 f29538b;

    public po0(to0 to0Var) {
        this.f29538b = to0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        to0 to0Var = this.f29538b;
        return ((qo0) to0Var.f30912n.get(i10)).equals(to0Var.f30913r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        to0 to0Var = this.f29538b;
        if (((qo0) to0Var.f30912n.get(i10)).f29875a.h == ((qo0) to0Var.f30913r.get(i11)).f29875a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f29538b.f30913r.size();
    }

    @Override
    public final int e() {
        return this.f29538b.f30912n.size();
    }
}
