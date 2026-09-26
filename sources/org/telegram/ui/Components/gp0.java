package org.telegram.ui.Components;
public final class gp0 implements rb {
    public final qc f24492a;
    public final ff f24493b;

    public gp0(ff ffVar, qc qcVar) {
        this.f24493b = ffVar;
        this.f24492a = qcVar;
    }

    @Override
    public final void c() {
        this.f24493b.G.remove(this.f24492a);
    }

    @Override
    public final void d() {
        this.f24493b.G.add(this.f24492a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
