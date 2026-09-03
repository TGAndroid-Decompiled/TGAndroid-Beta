package org.telegram.ui.Components;
public final class qa extends f2.r0 {
    public final f2.r0 f30372a;
    public final ra f30373b;

    public qa(ra raVar, f2.r0 r0Var) {
        this.f30373b = raVar;
        this.f30372a = r0Var;
    }

    @Override
    public final void a() {
        this.f30372a.a();
    }

    @Override
    public final void b(int i10, int i11) {
        this.f30372a.b(i10 + (!((sa) this.f30373b.f30705f).N ? 1 : 0), i11);
    }

    @Override
    public final void c(int i10, int i11, Object obj) {
        this.f30372a.c(i10 + (!((sa) this.f30373b.f30705f).N ? 1 : 0), i11, obj);
    }

    @Override
    public final void d(int i10, int i11) {
        this.f30372a.d(i10 + (!((sa) this.f30373b.f30705f).N ? 1 : 0), i11);
    }

    @Override
    public final void e(int i10, int i11) {
        int i12 = !((sa) this.f30373b.f30705f).N ? 1 : 0;
        this.f30372a.e(i10 + i12, i11 + i12);
    }

    @Override
    public final void f(int i10, int i11) {
        this.f30372a.f(i10 + (!((sa) this.f30373b.f30705f).N ? 1 : 0), i11);
    }
}
