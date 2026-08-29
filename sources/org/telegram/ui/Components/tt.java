package org.telegram.ui.Components;
public final class tt implements Runnable {
    public final int f33038a;
    public final ut f33039b;

    public tt(ut utVar, int i10) {
        this.f33038a = i10;
        this.f33039b = utVar;
    }

    @Override
    public final void run() {
        switch (this.f33038a) {
            case 0:
                ut utVar = this.f33039b;
                utVar.post(new tt(utVar, 1));
                return;
            case 1:
                ut utVar2 = this.f33039b;
                utVar2.invalidateSpoilers();
                utVar2.b();
                return;
            case 2:
                ut.a(this.f33039b);
                return;
            case 3:
                ut utVar3 = this.f33039b;
                utVar3.post(new tt(utVar3, 4));
                return;
            default:
                this.f33039b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
