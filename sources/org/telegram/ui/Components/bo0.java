package org.telegram.ui.Components;
public final class bo0 implements xa {
    public final wb f24900a;
    public final ie f24901b;

    public bo0(ie ieVar, wb wbVar) {
        this.f24901b = ieVar;
        this.f24900a = wbVar;
    }

    @Override
    public final void a() {
        this.f24901b.G.add(this.f24900a);
    }

    @Override
    public final void b() {
        this.f24901b.G.remove(this.f24900a);
    }

    @Override
    public final void c(wb wbVar) {
    }

    @Override
    public final void d() {
    }
}
