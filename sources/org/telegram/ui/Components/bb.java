package org.telegram.ui.Components;
public final class bb extends s4.k0 {
    public final s4.k0 f24910a;
    public final cb f24911b;

    public bb(cb cbVar, s4.k0 k0Var) {
        this.f24911b = cbVar;
        this.f24910a = k0Var;
    }

    @Override
    public final void a() {
        this.f24910a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f24910a.b(i10 + (!((eb) this.f24911b.f25262f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f24910a.c(i10 + (!((eb) this.f24911b.f25262f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f24910a.d(i10 + (!((eb) this.f24911b.f25262f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((eb) this.f24911b.f25262f).P ? 1 : 0;
        this.f24910a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f24910a.f(i10 + (!((eb) this.f24911b.f25262f).P ? 1 : 0), i11);
    }
}
