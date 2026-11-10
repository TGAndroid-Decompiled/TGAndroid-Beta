package org.telegram.ui;
public final class im implements org.telegram.messenger.ep {
    public final ji f46661a;
    public final cn f46662b;
    public final nm f46663c;

    public im(nm nmVar, ji jiVar, cn cnVar) {
        this.f46663c = nmVar;
        this.f46661a = jiVar;
        this.f46662b = cnVar;
    }

    @Override
    public final void a() {
        this.f46661a.c(false);
        this.f46663c.f48227a.presentFragment(this.f46662b);
    }

    @Override
    public final void f(boolean z9) {
        this.f46661a.c(false);
        this.f46663c.f48227a.presentFragment(this.f46662b);
    }
}
