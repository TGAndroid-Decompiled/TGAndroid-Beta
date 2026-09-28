package org.telegram.ui.Components;
public final class ya extends s4.j0 {
    public final s4.j0 f30632a;
    public final za f30633b;

    public ya(za zaVar, s4.j0 j0Var) {
        this.f30633b = zaVar;
        this.f30632a = j0Var;
    }

    @Override
    public final void a() {
        this.f30632a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f30632a.b(i10 + (!((bb) this.f30633b.f30863f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f30632a.c(i10 + (!((bb) this.f30633b.f30863f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f30632a.d(i10 + (!((bb) this.f30633b.f30863f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f30633b.f30863f).P ? 1 : 0;
        this.f30632a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f30632a.f(i10 + (!((bb) this.f30633b.f30863f).P ? 1 : 0), i11);
    }
}
