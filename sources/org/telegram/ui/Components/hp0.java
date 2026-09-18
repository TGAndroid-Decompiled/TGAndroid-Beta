package org.telegram.ui.Components;
public final class hp0 implements rb {
    public final qc f24712a;
    public final ef f24713b;

    public hp0(ef efVar, qc qcVar) {
        this.f24713b = efVar;
        this.f24712a = qcVar;
    }

    @Override
    public final void c() {
        this.f24713b.G.remove(this.f24712a);
    }

    @Override
    public final void d() {
        this.f24713b.G.add(this.f24712a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
