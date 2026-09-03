package org.telegram.ui.Components;
public final class jn0 extends f2.q {
    public final nn0 f25986b;

    public jn0(nn0 nn0Var) {
        this.f25986b = nn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        nn0 nn0Var = this.f25986b;
        return ((kn0) nn0Var.f27312n.get(i10)).equals(nn0Var.f27313r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        nn0 nn0Var = this.f25986b;
        if (((kn0) nn0Var.f27312n.get(i10)).f26357a.h == ((kn0) nn0Var.f27313r.get(i11)).f26357a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25986b.f27313r.size();
    }

    @Override
    public final int e() {
        return this.f25986b.f27312n.size();
    }
}
