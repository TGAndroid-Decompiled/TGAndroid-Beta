package org.telegram.ui.Components;
public final class np0 implements sb {
    public final rc f29134a;
    public final gf f29135b;

    public np0(gf gfVar, rc rcVar) {
        this.f29135b = gfVar;
        this.f29134a = rcVar;
    }

    @Override
    public final void c() {
        this.f29135b.G.remove(this.f29134a);
    }

    @Override
    public final void d() {
        this.f29135b.G.add(this.f29134a);
    }

    @Override
    public final void a(rc rcVar) {
    }

    @Override
    public final void b() {
    }
}
