package org.telegram.ui.Components;
public final class oa extends v4.k0 {
    public final v4.k0 f38076a;
    public final pa f38077b;

    public oa(pa paVar, v4.k0 k0Var) {
        this.f38077b = paVar;
        this.f38076a = k0Var;
    }

    @Override
    public final void a() {
        this.f38076a.a();
    }

    @Override
    public final void b(int i7, int i10) {
        this.f38076a.b(i7 + (!((ra) this.f38077b.f38442f).K1 ? 1 : 0), i10);
    }

    @Override
    public final void c(int i7, int i10, Object obj) {
        this.f38076a.c(i7 + (!((ra) this.f38077b.f38442f).K1 ? 1 : 0), i10, obj);
    }

    @Override
    public final void d(int i7, int i10) {
        this.f38076a.d(i7 + (!((ra) this.f38077b.f38442f).K1 ? 1 : 0), i10);
    }

    @Override
    public final void e(int i7, int i10) {
        int i11 = !((ra) this.f38077b.f38442f).K1 ? 1 : 0;
        this.f38076a.e(i7 + i11, i10 + i11);
    }

    @Override
    public final void f(int i7, int i10) {
        this.f38076a.f(i7 + (!((ra) this.f38077b.f38442f).K1 ? 1 : 0), i10);
    }
}
