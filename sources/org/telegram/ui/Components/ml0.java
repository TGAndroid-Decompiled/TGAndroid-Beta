package org.telegram.ui.Components;
public final class ml0 extends v4.o {
    public final ql0 f36016b;

    public ml0(ql0 ql0Var) {
        this.f36016b = ql0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        ql0 ql0Var = this.f36016b;
        return ((nl0) ql0Var.f37447n.get(i7)).equals(ql0Var.f37448r.get(i10));
    }

    @Override
    public final boolean b(int i7, int i10) {
        ql0 ql0Var = this.f36016b;
        if (((nl0) ql0Var.f37447n.get(i7)).f36435a.h == ((nl0) ql0Var.f37448r.get(i10)).f36435a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36016b.f37448r.size();
    }

    @Override
    public final int e() {
        return this.f36016b.f37447n.size();
    }
}
