package org.telegram.ui.Components;
public final class gp0 implements qb {
    public final pc f24435a;
    public final ef f24436b;

    public gp0(ef efVar, pc pcVar) {
        this.f24436b = efVar;
        this.f24435a = pcVar;
    }

    @Override
    public final void c() {
        this.f24436b.G.remove(this.f24435a);
    }

    @Override
    public final void d() {
        this.f24436b.G.add(this.f24435a);
    }

    @Override
    public final void a(pc pcVar) {
    }

    @Override
    public final void b() {
    }
}
