package org.telegram.ui.Components;
public final class jp0 implements sb {
    public final rc f25528a;
    public final gf f25529b;

    public jp0(gf gfVar, rc rcVar) {
        this.f25529b = gfVar;
        this.f25528a = rcVar;
    }

    @Override
    public final void c() {
        this.f25529b.G.remove(this.f25528a);
    }

    @Override
    public final void d() {
        this.f25529b.G.add(this.f25528a);
    }

    @Override
    public final void a(rc rcVar) {
    }

    @Override
    public final void b() {
    }
}
