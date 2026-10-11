package org.telegram.ui.Components;
public final class ab extends s4.k0 {
    public final s4.k0 f24548a;
    public final bb f24549b;

    public ab(bb bbVar, s4.k0 k0Var) {
        this.f24549b = bbVar;
        this.f24548a = k0Var;
    }

    @Override
    public final void a() {
        this.f24548a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f24548a.b(i10 + (!((db) this.f24549b.f24968f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f24548a.c(i10 + (!((db) this.f24549b.f24968f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f24548a.d(i10 + (!((db) this.f24549b.f24968f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((db) this.f24549b.f24968f).P ? 1 : 0;
        this.f24548a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f24548a.f(i10 + (!((db) this.f24549b.f24968f).P ? 1 : 0), i11);
    }
}
