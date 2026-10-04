package org.telegram.ui.Components;
public final class mp0 implements sb {
    public final rc f28675a;
    public final gf f28676b;

    public mp0(gf gfVar, rc rcVar) {
        this.f28676b = gfVar;
        this.f28675a = rcVar;
    }

    @Override
    public final void c() {
        this.f28676b.G.remove(this.f28675a);
    }

    @Override
    public final void d() {
        this.f28676b.G.add(this.f28675a);
    }

    @Override
    public final void a(rc rcVar) {
    }

    @Override
    public final void b() {
    }
}
