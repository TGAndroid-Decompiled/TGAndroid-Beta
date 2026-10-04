package org.telegram.ui.Components;
public final class za extends s4.j0 {
    public final s4.j0 f33468a;
    public final ab f33469b;

    public za(ab abVar, s4.j0 j0Var) {
        this.f33469b = abVar;
        this.f33468a = j0Var;
    }

    @Override
    public final void a() {
        this.f33468a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f33468a.b(i10 + (!((cb) this.f33469b.f24512f).P ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f33468a.c(i10 + (!((cb) this.f33469b.f24512f).P ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f33468a.d(i10 + (!((cb) this.f33469b.f24512f).P ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((cb) this.f33469b.f24512f).P ? 1 : 0;
        this.f33468a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f33468a.f(i10 + (!((cb) this.f33469b.f24512f).P ? 1 : 0), i11);
    }
}
