package org.telegram.ui.Components;
public final class kn0 extends f2.q {
    public final on0 f28447b;

    public kn0(on0 on0Var) {
        this.f28447b = on0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        on0 on0Var = this.f28447b;
        return ((ln0) on0Var.f29829n.get(i10)).equals(on0Var.f29830r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        on0 on0Var = this.f28447b;
        if (((ln0) on0Var.f29829n.get(i10)).f28810a.h == ((ln0) on0Var.f29830r.get(i11)).f28810a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f28447b.f29830r.size();
    }

    @Override
    public final int e() {
        return this.f28447b.f29829n.size();
    }
}
