package org.telegram.ui.Components;
public final class ip0 implements qb {
    public final pc f25165a;
    public final ef f25166b;

    public ip0(ef efVar, pc pcVar) {
        this.f25166b = efVar;
        this.f25165a = pcVar;
    }

    @Override
    public final void c() {
        this.f25166b.G.remove(this.f25165a);
    }

    @Override
    public final void d() {
        this.f25166b.G.add(this.f25165a);
    }

    @Override
    public final void a(pc pcVar) {
    }

    @Override
    public final void b() {
    }
}
