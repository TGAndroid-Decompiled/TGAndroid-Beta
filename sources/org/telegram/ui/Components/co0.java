package org.telegram.ui.Components;
public final class co0 extends s4.o {
    public final go0 f25231b;

    public co0(go0 go0Var) {
        this.f25231b = go0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        go0 go0Var = this.f25231b;
        return ((do0) go0Var.f26621n.get(i10)).equals(go0Var.f26622r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        go0 go0Var = this.f25231b;
        if (((do0) go0Var.f26621n.get(i10)).f25578a.h == ((do0) go0Var.f26622r.get(i11)).f25578a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25231b.f26622r.size();
    }

    @Override
    public final int e() {
        return this.f25231b.f26621n.size();
    }
}
