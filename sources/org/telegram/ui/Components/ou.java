package org.telegram.ui.Components;
public final class ou implements Runnable {
    public final int f27741a;
    public final pu f27742b;

    public ou(pu puVar, int i10) {
        this.f27741a = i10;
        this.f27742b = puVar;
    }

    @Override
    public final void run() {
        switch (this.f27741a) {
            case 0:
                pu puVar = this.f27742b;
                puVar.post(new ou(puVar, 1));
                return;
            case 1:
                pu puVar2 = this.f27742b;
                puVar2.invalidateSpoilers();
                puVar2.b();
                return;
            case 2:
                pu.a(this.f27742b);
                return;
            case 3:
                pu puVar3 = this.f27742b;
                puVar3.post(new ou(puVar3, 4));
                return;
            default:
                this.f27742b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
