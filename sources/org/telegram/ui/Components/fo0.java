package org.telegram.ui.Components;
public final class fo0 extends s4.o {
    public final jo0 f26432b;

    public fo0(jo0 jo0Var) {
        this.f26432b = jo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        jo0 jo0Var = this.f26432b;
        return ((go0) jo0Var.f27726n.get(i10)).equals(jo0Var.f27727r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        jo0 jo0Var = this.f26432b;
        if (((go0) jo0Var.f27726n.get(i10)).f26687a.h == ((go0) jo0Var.f27727r.get(i11)).f26687a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f26432b.f27727r.size();
    }

    @Override
    public final int e() {
        return this.f26432b.f27726n.size();
    }
}
