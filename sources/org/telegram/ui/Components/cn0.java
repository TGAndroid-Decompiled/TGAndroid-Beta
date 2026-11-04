package org.telegram.ui.Components;
public final class cn0 implements cb {
    public final ac f32774a;
    public final le f32775b;

    public cn0(le leVar, ac acVar) {
        this.f32775b = leVar;
        this.f32774a = acVar;
    }

    @Override
    public final void a() {
        this.f32775b.G.add(this.f32774a);
    }

    @Override
    public final void b() {
        this.f32775b.G.remove(this.f32774a);
    }

    @Override
    public final void c(ac acVar) {
    }

    @Override
    public final void d() {
    }
}
