package org.telegram.ui.Components;
public final class ip0 implements rb {
    public final qc f25169a;
    public final ff f25170b;

    public ip0(ff ffVar, qc qcVar) {
        this.f25170b = ffVar;
        this.f25169a = qcVar;
    }

    @Override
    public final void c() {
        this.f25170b.G.remove(this.f25169a);
    }

    @Override
    public final void d() {
        this.f25170b.G.add(this.f25169a);
    }

    @Override
    public final void a(qc qcVar) {
    }

    @Override
    public final void b() {
    }
}
