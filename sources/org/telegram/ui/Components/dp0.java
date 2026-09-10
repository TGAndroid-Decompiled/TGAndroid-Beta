package org.telegram.ui.Components;
public final class dp0 implements qb {
    public final pc f22452a;
    public final ff f22453b;

    public dp0(ff ffVar, pc pcVar) {
        this.f22453b = ffVar;
        this.f22452a = pcVar;
    }

    @Override
    public final void c() {
        this.f22453b.G.remove(this.f22452a);
    }

    @Override
    public final void d() {
        this.f22453b.G.add(this.f22452a);
    }

    @Override
    public final void a(pc pcVar) {
    }

    @Override
    public final void b() {
    }
}
