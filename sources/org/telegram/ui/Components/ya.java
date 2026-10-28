package org.telegram.ui.Components;
public final class ya extends s4.j0 {
    public final s4.j0 f35019a;
    public final za f35020b;

    public ya(za zaVar, s4.j0 j0Var) {
        this.f35020b = zaVar;
        this.f35019a = j0Var;
    }

    @Override
    public final void a() {
        this.f35019a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f35019a.b(i10 + (!((bb) this.f35020b.f35304f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f35019a.c(i10 + (!((bb) this.f35020b.f35304f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f35019a.d(i10 + (!((bb) this.f35020b.f35304f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f35020b.f35304f).P ? 1 : 0;
        this.f35019a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f35019a.f(i10 + (!((bb) this.f35020b.f35304f).P ? 1 : 0), i11);
    }
}
