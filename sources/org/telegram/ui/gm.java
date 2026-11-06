package org.telegram.ui;
public final class gm implements org.telegram.messenger.ep {
    public final hi f46025a;
    public final an f46026b;
    public final lm f46027c;

    public gm(lm lmVar, hi hiVar, an anVar) {
        this.f46027c = lmVar;
        this.f46025a = hiVar;
        this.f46026b = anVar;
    }

    @Override
    public final void a() {
        this.f46025a.c(false);
        this.f46027c.f47560a.presentFragment(this.f46026b);
    }

    @Override
    public final void f(boolean z9) {
        this.f46025a.c(false);
        this.f46027c.f47560a.presentFragment(this.f46026b);
    }
}
