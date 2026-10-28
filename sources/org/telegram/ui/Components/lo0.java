package org.telegram.ui.Components;
public final class lo0 extends s4.p {
    public final po0 f30277b;

    public lo0(po0 po0Var) {
        this.f30277b = po0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        po0 po0Var = this.f30277b;
        return ((mo0) po0Var.f31687n.get(i10)).equals(po0Var.f31688r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        po0 po0Var = this.f30277b;
        if (((mo0) po0Var.f31687n.get(i10)).f30567a.h == ((mo0) po0Var.f31688r.get(i11)).f30567a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f30277b.f31688r.size();
    }

    @Override
    public final int e() {
        return this.f30277b.f31687n.size();
    }
}
