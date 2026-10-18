package org.telegram.ui.Components;
public final class bo0 extends s4.o {
    public final fo0 f25023b;

    public bo0(fo0 fo0Var) {
        this.f25023b = fo0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        fo0 fo0Var = this.f25023b;
        return ((co0) fo0Var.f26331n.get(i10)).equals(fo0Var.f26332r.get(i11));
    }

    @Override
    public final boolean b(int i10, int i11) {
        fo0 fo0Var = this.f25023b;
        if (((co0) fo0Var.f26331n.get(i10)).f25320a.h == ((co0) fo0Var.f26332r.get(i11)).f25320a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f25023b.f26332r.size();
    }

    @Override
    public final int e() {
        return this.f25023b.f26331n.size();
    }
}
