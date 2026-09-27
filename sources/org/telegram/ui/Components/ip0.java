package org.telegram.ui.Components;
public final class ip0 implements rb {
    public final qc f25210a;
    public final ff f25211b;

    public ip0(ff ffVar, qc qcVar) {
        this.f25211b = ffVar;
        this.f25210a = qcVar;
    }

    @Override
    public final void c() {
        this.f25211b.G.remove(this.f25210a);
    }

    @Override
    public final void d() {
        this.f25211b.G.add(this.f25210a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
