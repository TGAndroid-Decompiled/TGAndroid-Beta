package org.telegram.ui;
public final class cm implements org.telegram.messenger.vo {
    public final di f44385a;
    public final wm f44386b;
    public final hm f44387c;

    public cm(hm hmVar, di diVar, wm wmVar) {
        this.f44387c = hmVar;
        this.f44385a = diVar;
        this.f44386b = wmVar;
    }

    @Override
    public final void a() {
        this.f44385a.c(false);
        this.f44387c.f45934a.presentFragment(this.f44386b);
    }

    @Override
    public final void j(boolean z10) {
        this.f44385a.c(false);
        this.f44387c.f45934a.presentFragment(this.f44386b);
    }
}
