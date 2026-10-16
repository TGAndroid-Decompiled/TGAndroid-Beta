package org.telegram.ui.Components;
public final class ab extends s4.i0 {
    public final s4.i0 f23186a;
    public final bb f23187b;

    public ab(bb bbVar, s4.i0 i0Var) {
        this.f23187b = bbVar;
        this.f23186a = i0Var;
    }

    @Override
    public final void a() {
        this.f23186a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f23186a.b(i10 + (!((db) this.f23187b.f23429f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f23186a.c(i10 + (!((db) this.f23187b.f23429f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f23186a.d(i10 + (!((db) this.f23187b.f23429f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((db) this.f23187b.f23429f).P ? 1 : 0;
        this.f23186a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f23186a.f(i10 + (!((db) this.f23187b.f23429f).P ? 1 : 0), i11);
    }
}
