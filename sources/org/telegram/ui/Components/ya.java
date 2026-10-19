package org.telegram.ui.Components;
public final class ya extends s4.i0 {
    public final s4.i0 f32590a;
    public final za f32591b;

    public ya(za zaVar, s4.i0 i0Var) {
        this.f32591b = zaVar;
        this.f32590a = i0Var;
    }

    @Override
    public final void a() {
        this.f32590a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32590a.b(i10 + (!((bb) this.f32591b.f32895f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32590a.c(i10 + (!((bb) this.f32591b.f32895f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32590a.d(i10 + (!((bb) this.f32591b.f32895f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f32591b.f32895f).P ? 1 : 0;
        this.f32590a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32590a.f(i10 + (!((bb) this.f32591b.f32895f).P ? 1 : 0), i11);
    }
}
