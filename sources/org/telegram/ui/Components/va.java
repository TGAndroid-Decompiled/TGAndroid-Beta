package org.telegram.ui.Components;
public final class va extends f2.r0 {
    public final f2.r0 f33507a;
    public final wa f33508b;

    public va(wa waVar, f2.r0 r0Var) {
        this.f33508b = waVar;
        this.f33507a = r0Var;
    }

    @Override
    public final void a() {
        this.f33507a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f33507a.b(i10 + (!((xa) this.f33508b.f34358f).M ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f33507a.c(i10 + (!((xa) this.f33508b.f34358f).M ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f33507a.d(i10 + (!((xa) this.f33508b.f34358f).M ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((xa) this.f33508b.f34358f).M ? 1 : 0;
        this.f33507a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f33507a.f(i10 + (!((xa) this.f33508b.f34358f).M ? 1 : 0), i11);
    }
}
