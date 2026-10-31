package org.telegram.ui.Components;
public final class ea extends s4.i0 {
    public final s4.i0 f25740a;
    public final fa f25741b;

    public ea(fa faVar, s4.i0 i0Var) {
        this.f25741b = faVar;
        this.f25740a = i0Var;
    }

    @Override
    public final void a() {
        this.f25740a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f25740a.b(i10 + (!((ha) this.f25741b.f26021f).G1 ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f25740a.c(i10 + (!((ha) this.f25741b.f26021f).G1 ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f25740a.d(i10 + (!((ha) this.f25741b.f26021f).G1 ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((ha) this.f25741b.f26021f).G1 ? 1 : 0;
        this.f25740a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f25740a.f(i10 + (!((ha) this.f25741b.f26021f).G1 ? 1 : 0), i11);
    }
}
