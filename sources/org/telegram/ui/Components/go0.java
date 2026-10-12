package org.telegram.ui.Components;
public final class go0 extends s4.o {
    public final ko0 f25371b;

    public go0(ko0 ko0Var) {
        this.f25371b = ko0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        ko0 ko0Var = this.f25371b;
        return ((ho0) ko0Var.f26768n.get(i10)).equals(ko0Var.f26769r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        ko0 ko0Var = this.f25371b;
        if (((ho0) ko0Var.f26768n.get(i10)).f25716a.h == ((ho0) ko0Var.f26769r.get(i11)).f25716a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25371b.f26769r.size();
    }

    @Override
    public final int e() {
        return this.f25371b.f26768n.size();
    }
}
