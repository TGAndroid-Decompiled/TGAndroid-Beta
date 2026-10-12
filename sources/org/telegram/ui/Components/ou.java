package org.telegram.ui.Components;
public final class ou implements Runnable {
    public final int f28057a;
    public final pu f28058b;

    public ou(pu puVar, int i10) {
        this.f28057a = i10;
        this.f28058b = puVar;
    }

    @Override
    public final void run() {
        switch (this.f28057a) {
            case 0:
                pu puVar = this.f28058b;
                puVar.post(new ou(puVar, 1));
                return;
            case 1:
                pu puVar2 = this.f28058b;
                puVar2.invalidateSpoilers();
                puVar2.b();
                return;
            case 2:
                pu.a(this.f28058b);
                return;
            case 3:
                pu puVar3 = this.f28058b;
                puVar3.post(new ou(puVar3, 4));
                return;
            default:
                this.f28058b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
