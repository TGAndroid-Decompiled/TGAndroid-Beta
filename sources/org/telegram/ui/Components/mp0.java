package org.telegram.ui.Components;
public final class mp0 implements sb {
    public final rc f28674a;
    public final gf f28675b;

    public mp0(gf gfVar, rc rcVar) {
        this.f28675b = gfVar;
        this.f28674a = rcVar;
    }

    @Override
    public final void c() {
        this.f28675b.G.remove(this.f28674a);
    }

    @Override
    public final void d() {
        this.f28675b.G.add(this.f28674a);
    }

    @Override
    public final void a(rc rcVar) {
    }

    @Override
    public final void b() {
    }
}
