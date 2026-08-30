package org.telegram.ui.Components;
public final class wt implements Runnable {
    public final int f30425a;
    public final xt f30426b;

    public wt(xt xtVar, int i10) {
        this.f30425a = i10;
        this.f30426b = xtVar;
    }

    @Override
    public final void run() {
        switch (this.f30425a) {
            case 0:
                xt xtVar = this.f30426b;
                xtVar.post(new wt(xtVar, 1));
                return;
            case 1:
                xt xtVar2 = this.f30426b;
                xtVar2.invalidateSpoilers();
                xtVar2.b();
                return;
            case 2:
                xt.a(this.f30426b);
                return;
            case 3:
                xt xtVar3 = this.f30426b;
                xtVar3.post(new wt(xtVar3, 4));
                return;
            default:
                this.f30426b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
