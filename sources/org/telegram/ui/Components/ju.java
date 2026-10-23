package org.telegram.ui.Components;
public final class ju implements Runnable {
    public final int f27642a;
    public final ku f27643b;

    public ju(ku kuVar, int i10) {
        this.f27642a = i10;
        this.f27643b = kuVar;
    }

    @Override
    public final void run() {
        switch (this.f27642a) {
            case 0:
                ku kuVar = this.f27643b;
                kuVar.post(new ju(kuVar, 1));
                return;
            case 1:
                ku kuVar2 = this.f27643b;
                kuVar2.invalidateSpoilers();
                kuVar2.b();
                return;
            case 2:
                ku.a(this.f27643b);
                return;
            case 3:
                ku kuVar3 = this.f27643b;
                kuVar3.post(new ju(kuVar3, 4));
                return;
            default:
                this.f27643b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
