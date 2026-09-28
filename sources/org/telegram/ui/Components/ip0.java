package org.telegram.ui.Components;
public final class ip0 implements rb {
    public final qc f25191a;
    public final ff f25192b;

    public ip0(ff ffVar, qc qcVar) {
        this.f25192b = ffVar;
        this.f25191a = qcVar;
    }

    @Override
    public final void c() {
        this.f25192b.G.remove(this.f25191a);
    }

    @Override
    public final void d() {
        this.f25192b.G.add(this.f25191a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
