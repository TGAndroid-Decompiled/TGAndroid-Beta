package org.telegram.ui.Components;
public final class ja extends u4.j0 {
    public final u4.j0 f35004a;
    public final ka f35005b;

    public ja(ka kaVar, u4.j0 j0Var) {
        this.f35005b = kaVar;
        this.f35004a = j0Var;
    }

    @Override
    public final void a() {
        this.f35004a.a();
    }

    @Override
    public final void b(int i3, int i10) {
        this.f35004a.b(i3 + (!((ma) this.f35005b.f35357f).H1 ? 1 : 0), i10);
    }

    @Override
    public final void c(int i3, int i10, Object obj) {
        this.f35004a.c(i3 + (!((ma) this.f35005b.f35357f).H1 ? 1 : 0), i10, obj);
    }

    @Override
    public final void d(int i3, int i10) {
        this.f35004a.d(i3 + (!((ma) this.f35005b.f35357f).H1 ? 1 : 0), i10);
    }

    @Override
    public final void e(int i3, int i10) {
        int i11 = !((ma) this.f35005b.f35357f).H1 ? 1 : 0;
        this.f35004a.e(i3 + i11, i10 + i11);
    }

    @Override
    public final void f(int i3, int i10) {
        this.f35004a.f(i3 + (!((ma) this.f35005b.f35357f).H1 ? 1 : 0), i10);
    }
}
