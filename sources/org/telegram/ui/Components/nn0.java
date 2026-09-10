package org.telegram.ui.Components;
public final class nn0 extends s4.o {
    public final rn0 f25562b;

    public nn0(rn0 rn0Var) {
        this.f25562b = rn0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        rn0 rn0Var = this.f25562b;
        return ((on0) rn0Var.f26701n.get(i10)).equals(rn0Var.f26702r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        rn0 rn0Var = this.f25562b;
        if (((on0) rn0Var.f26701n.get(i10)).f25845a.h == ((on0) rn0Var.f26702r.get(i11)).f25845a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25562b.f26702r.size();
    }

    @Override
    public final int e() {
        return this.f25562b.f26701n.size();
    }
}
