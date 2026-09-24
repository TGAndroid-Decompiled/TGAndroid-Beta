package org.telegram.ui.Components;
public final class gp0 implements rb {
    public final qc f24487a;
    public final ff f24488b;

    public gp0(ff ffVar, qc qcVar) {
        this.f24488b = ffVar;
        this.f24487a = qcVar;
    }

    @Override
    public final void c() {
        this.f24488b.G.remove(this.f24487a);
    }

    @Override
    public final void d() {
        this.f24488b.G.add(this.f24487a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
