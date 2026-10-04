package org.telegram.ui.Components;
public final class mp0 implements sb {
    public final rc f28680a;
    public final gf f28681b;

    public mp0(gf gfVar, rc rcVar) {
        this.f28681b = gfVar;
        this.f28680a = rcVar;
    }

    @Override
    public final void c() {
        this.f28681b.G.remove(this.f28680a);
    }

    @Override
    public final void d() {
        this.f28681b.G.add(this.f28680a);
    }

    @Override
    public final void a(rc rcVar) {
    }

    @Override
    public final void b() {
    }
}
