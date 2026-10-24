package org.telegram.ui.Components;
public final class wa extends s4.i0 {
    public final s4.i0 f32173a;
    public final xa f32174b;

    public wa(xa xaVar, s4.i0 i0Var) {
        this.f32174b = xaVar;
        this.f32173a = i0Var;
    }

    @Override
    public final void a() {
        this.f32173a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f32173a.b(i10 + (!((za) this.f32174b.f32558f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f32173a.c(i10 + (!((za) this.f32174b.f32558f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f32173a.d(i10 + (!((za) this.f32174b.f32558f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((za) this.f32174b.f32558f).P ? 1 : 0;
        this.f32173a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f32173a.f(i10 + (!((za) this.f32174b.f32558f).P ? 1 : 0), i11);
    }
}
