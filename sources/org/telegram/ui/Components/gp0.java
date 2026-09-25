package org.telegram.ui.Components;
public final class gp0 implements rb {
    public final qc f24493a;
    public final ff f24494b;

    public gp0(ff ffVar, qc qcVar) {
        this.f24494b = ffVar;
        this.f24493a = qcVar;
    }

    @Override
    public final void c() {
        this.f24494b.G.remove(this.f24493a);
    }

    @Override
    public final void d() {
        this.f24494b.G.add(this.f24493a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
