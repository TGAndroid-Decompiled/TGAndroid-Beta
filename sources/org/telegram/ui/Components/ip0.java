package org.telegram.ui.Components;
public final class ip0 implements rb {
    public final qc f25190a;
    public final ff f25191b;

    public ip0(ff ffVar, qc qcVar) {
        this.f25191b = ffVar;
        this.f25190a = qcVar;
    }

    @Override
    public final void c() {
        this.f25191b.G.remove(this.f25190a);
    }

    @Override
    public final void d() {
        this.f25191b.G.add(this.f25190a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
