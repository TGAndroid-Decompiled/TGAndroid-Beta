package org.telegram.ui.Components;
public final class ab extends s4.k0 {
    public final s4.k0 f24272a;
    public final bb f24273b;

    public ab(bb bbVar, s4.k0 k0Var) {
        this.f24273b = bbVar;
        this.f24272a = k0Var;
    }

    @Override
    public final void a() {
        this.f24272a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f24272a.b(i10 + (!((db) this.f24273b.f24609f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f24272a.c(i10 + (!((db) this.f24273b.f24609f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f24272a.d(i10 + (!((db) this.f24273b.f24609f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((db) this.f24273b.f24609f).P ? 1 : 0;
        this.f24272a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f24272a.f(i10 + (!((db) this.f24273b.f24609f).P ? 1 : 0), i11);
    }
}
