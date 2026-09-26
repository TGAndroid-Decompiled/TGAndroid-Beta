package org.telegram.ui.Components;
public final class hp0 implements rb {
    public final qc f24831a;
    public final ff f24832b;

    public hp0(ff ffVar, qc qcVar) {
        this.f24832b = ffVar;
        this.f24831a = qcVar;
    }

    @Override
    public final void c() {
        this.f24832b.G.remove(this.f24831a);
    }

    @Override
    public final void d() {
        this.f24832b.G.add(this.f24831a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
