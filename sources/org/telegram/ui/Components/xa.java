package org.telegram.ui.Components;
public final class xa extends s4.j0 {
    public final s4.j0 f30294a;
    public final ya f30295b;

    public xa(ya yaVar, s4.j0 j0Var) {
        this.f30295b = yaVar;
        this.f30294a = j0Var;
    }

    @Override
    public final void a() {
        this.f30294a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f30294a.b(i10 + (!((ab) this.f30295b.f30614f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f30294a.c(i10 + (!((ab) this.f30295b.f30614f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f30294a.d(i10 + (!((ab) this.f30295b.f30614f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((ab) this.f30295b.f30614f).P ? 1 : 0;
        this.f30294a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f30294a.f(i10 + (!((ab) this.f30295b.f30614f).P ? 1 : 0), i11);
    }
}
