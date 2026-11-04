package org.telegram.ui.Components;
public final class pl0 extends u4.o {
    public final tl0 f37177b;

    public pl0(tl0 tl0Var) {
        this.f37177b = tl0Var;
    }

    @Override
    public final boolean a(int i3, int i10) {
        tl0 tl0Var = this.f37177b;
        return ((ql0) tl0Var.f38490n.get(i3)).equals(tl0Var.f38491r.get(i10));
    }

    @Override
    public final boolean b(int i3, int i10) {
        tl0 tl0Var = this.f37177b;
        if (((ql0) tl0Var.f38490n.get(i3)).f37490a.h == ((ql0) tl0Var.f38491r.get(i10)).f37490a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37177b.f38491r.size();
    }

    @Override
    public final int e() {
        return this.f37177b.f38490n.size();
    }
}
