package org.telegram.ui.Components;
public final class co0 extends s4.o {
    public final go0 f25228b;

    public co0(go0 go0Var) {
        this.f25228b = go0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        go0 go0Var = this.f25228b;
        return ((do0) go0Var.f26618n.get(i10)).equals(go0Var.f26619r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        go0 go0Var = this.f25228b;
        if (((do0) go0Var.f26618n.get(i10)).f25575a.h == ((do0) go0Var.f26619r.get(i11)).f25575a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25228b.f26619r.size();
    }

    @Override
    public final int e() {
        return this.f25228b.f26618n.size();
    }
}
