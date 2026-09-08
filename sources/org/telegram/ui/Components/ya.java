package org.telegram.ui.Components;
public final class ya extends s4.j0 {
    public final s4.j0 f32898a;
    public final za f32899b;

    public ya(za zaVar, s4.j0 j0Var) {
        this.f32899b = zaVar;
        this.f32898a = j0Var;
    }

    @Override
    public final void a() {
        this.f32898a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32898a.b(i10 + (!((bb) this.f32899b.f33141f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32898a.c(i10 + (!((bb) this.f32899b.f33141f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32898a.d(i10 + (!((bb) this.f32899b.f33141f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f32899b.f33141f).P ? 1 : 0;
        this.f32898a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32898a.f(i10 + (!((bb) this.f32899b.f33141f).P ? 1 : 0), i11);
    }
}
