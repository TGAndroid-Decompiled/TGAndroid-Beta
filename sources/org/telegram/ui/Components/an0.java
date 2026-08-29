package org.telegram.ui.Components;
public final class an0 extends f2.q {
    public final en0 f26806b;

    public an0(en0 en0Var) {
        this.f26806b = en0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        en0 en0Var = this.f26806b;
        return ((bn0) en0Var.f28121n.get(i10)).equals(en0Var.f28122r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        en0 en0Var = this.f26806b;
        if (((bn0) en0Var.f28121n.get(i10)).f27188a.h == ((bn0) en0Var.f28122r.get(i11)).f27188a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f26806b.f28122r.size();
    }

    @Override
    public final int e() {
        return this.f26806b.f28121n.size();
    }
}
