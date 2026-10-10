package org.telegram.ui.Components;
public final class zp0 implements ub {
    public final tc f33648a;
    public final hf f33649b;

    public zp0(hf hfVar, tc tcVar) {
        this.f33649b = hfVar;
        this.f33648a = tcVar;
    }

    @Override
    public final void c() {
        this.f33649b.G.remove(this.f33648a);
    }

    @Override
    public final void d() {
        this.f33649b.G.add(this.f33648a);
    }

    @Override
    public final void a(tc tcVar) {
    }

    @Override
    public final void b() {
    }
}
