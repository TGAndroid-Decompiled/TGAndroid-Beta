package org.telegram.ui.Components;
public final class ju implements Runnable {
    public final int f27762a;
    public final ku f27763b;

    public ju(ku kuVar, int i10) {
        this.f27762a = i10;
        this.f27763b = kuVar;
    }

    @Override
    public final void run() {
        switch (this.f27762a) {
            case 0:
                ku kuVar = this.f27763b;
                kuVar.post(new ju(kuVar, 1));
                return;
            case 1:
                ku kuVar2 = this.f27763b;
                kuVar2.invalidateSpoilers();
                kuVar2.b();
                return;
            case 2:
                ku.a(this.f27763b);
                return;
            case 3:
                ku kuVar3 = this.f27763b;
                kuVar3.post(new ju(kuVar3, 4));
                return;
            default:
                this.f27763b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
