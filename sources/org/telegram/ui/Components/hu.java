package org.telegram.ui.Components;
public final class hu implements Runnable {
    public final int f27172a;
    public final iu f27173b;

    public hu(iu iuVar, int i10) {
        this.f27172a = i10;
        this.f27173b = iuVar;
    }

    @Override
    public final void run() {
        switch (this.f27172a) {
            case 0:
                iu iuVar = this.f27173b;
                iuVar.post(new hu(iuVar, 1));
                return;
            case 1:
                iu iuVar2 = this.f27173b;
                iuVar2.invalidateSpoilers();
                iuVar2.b();
                return;
            case 2:
                iu.a(this.f27173b);
                return;
            case 3:
                iu iuVar3 = this.f27173b;
                iuVar3.post(new hu(iuVar3, 4));
                return;
            default:
                this.f27173b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
