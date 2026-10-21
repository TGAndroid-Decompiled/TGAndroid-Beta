package org.telegram.ui.Components;
public final class ya extends s4.i0 {
    public final s4.i0 f32622a;
    public final za f32623b;

    public ya(za zaVar, s4.i0 i0Var) {
        this.f32623b = zaVar;
        this.f32622a = i0Var;
    }

    @Override
    public final void a() {
        this.f32622a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32622a.b(i10 + (!((bb) this.f32623b.f32865f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32622a.c(i10 + (!((bb) this.f32623b.f32865f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32622a.d(i10 + (!((bb) this.f32623b.f32865f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((bb) this.f32623b.f32865f).P ? 1 : 0;
        this.f32622a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32622a.f(i10 + (!((bb) this.f32623b.f32865f).P ? 1 : 0), i11);
    }
}
