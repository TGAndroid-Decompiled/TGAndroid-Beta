package org.telegram.ui;
public final class im implements org.telegram.messenger.ep {
    public final ji f46688a;
    public final cn f46689b;
    public final nm f46690c;

    public im(nm nmVar, ji jiVar, cn cnVar) {
        this.f46690c = nmVar;
        this.f46688a = jiVar;
        this.f46689b = cnVar;
    }

    @Override
    public final void a() {
        this.f46688a.c(false);
        this.f46690c.f48207a.presentFragment(this.f46689b);
    }

    @Override
    public final void f(boolean z9) {
        this.f46688a.c(false);
        this.f46690c.f48207a.presentFragment(this.f46689b);
    }
}
