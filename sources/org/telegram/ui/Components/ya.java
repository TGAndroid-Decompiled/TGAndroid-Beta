package org.telegram.ui.Components;
public final class ya extends s4.j0 {
    public final s4.j0 f32872a;
    public final za f32873b;

    public ya(za zaVar, s4.j0 j0Var) {
        this.f32873b = zaVar;
        this.f32872a = j0Var;
    }

    @Override
    public final void a() {
        this.f32872a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32872a.b(i10 + (!((bb) this.f32873b.f33115f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32872a.c(i10 + (!((bb) this.f32873b.f33115f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32872a.d(i10 + (!((bb) this.f32873b.f33115f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f32873b.f33115f).P ? 1 : 0;
        this.f32872a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32872a.f(i10 + (!((bb) this.f32873b.f33115f).P ? 1 : 0), i11);
    }
}
