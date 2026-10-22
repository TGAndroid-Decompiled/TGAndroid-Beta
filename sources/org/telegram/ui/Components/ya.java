package org.telegram.ui.Components;
public final class ya extends s4.i0 {
    public final s4.i0 f32625a;
    public final za f32626b;

    public ya(za zaVar, s4.i0 i0Var) {
        this.f32626b = zaVar;
        this.f32625a = i0Var;
    }

    @Override
    public final void a() {
        this.f32625a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32625a.b(i10 + (!((bb) this.f32626b.f32868f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32625a.c(i10 + (!((bb) this.f32626b.f32868f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32625a.d(i10 + (!((bb) this.f32626b.f32868f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f32626b.f32868f).P ? 1 : 0;
        this.f32625a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32625a.f(i10 + (!((bb) this.f32626b.f32868f).P ? 1 : 0), i11);
    }
}
