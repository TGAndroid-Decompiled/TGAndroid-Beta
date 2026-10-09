package org.telegram.ui.Components;
public final class yp0 implements ub {
    public final tc f33326a;
    public final hf f33327b;

    public yp0(hf hfVar, tc tcVar) {
        this.f33327b = hfVar;
        this.f33326a = tcVar;
    }

    @Override
    public final void c() {
        this.f33327b.G.remove(this.f33326a);
    }

    @Override
    public final void d() {
        this.f33327b.G.add(this.f33326a);
    }

    @Override
    public final void a(tc tcVar) {
    }

    @Override
    public final void b() {
    }
}
