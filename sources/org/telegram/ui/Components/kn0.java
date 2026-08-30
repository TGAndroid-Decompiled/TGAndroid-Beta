package org.telegram.ui.Components;
public final class kn0 extends f2.q {
    public final on0 f26316b;

    public kn0(on0 on0Var) {
        this.f26316b = on0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        on0 on0Var = this.f26316b;
        return ((ln0) on0Var.f27604n.get(i10)).equals(on0Var.f27605r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        on0 on0Var = this.f26316b;
        if (((ln0) on0Var.f27604n.get(i10)).f26817a.h == ((ln0) on0Var.f27605r.get(i11)).f26817a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f26316b.f27605r.size();
    }

    @Override
    public final int e() {
        return this.f26316b.f27604n.size();
    }
}
