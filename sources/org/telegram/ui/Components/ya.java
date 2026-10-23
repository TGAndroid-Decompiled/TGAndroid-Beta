package org.telegram.ui.Components;
public final class ya extends s4.i0 {
    public final s4.i0 f32860a;
    public final za f32861b;

    public ya(za zaVar, s4.i0 i0Var) {
        this.f32861b = zaVar;
        this.f32860a = i0Var;
    }

    @Override
    public final void a() {
        this.f32860a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32860a.b(i10 + (!((bb) this.f32861b.f33198f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32860a.c(i10 + (!((bb) this.f32861b.f33198f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32860a.d(i10 + (!((bb) this.f32861b.f33198f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f32861b.f33198f).P ? 1 : 0;
        this.f32860a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32860a.f(i10 + (!((bb) this.f32861b.f33198f).P ? 1 : 0), i11);
    }
}
