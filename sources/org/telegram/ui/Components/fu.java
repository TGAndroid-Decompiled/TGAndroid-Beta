package org.telegram.ui.Components;
public final class fu implements Runnable {
    public final int f24349a;
    public final gu f24350b;

    public fu(gu guVar, int i10) {
        this.f24349a = i10;
        this.f24350b = guVar;
    }

    @Override
    public final void run() {
        switch (this.f24349a) {
            case 0:
                gu guVar = this.f24350b;
                guVar.post(new fu(guVar, 1));
                return;
            case 1:
                gu guVar2 = this.f24350b;
                guVar2.invalidateSpoilers();
                guVar2.b();
                return;
            case 2:
                gu.a(this.f24350b);
                return;
            case 3:
                gu guVar3 = this.f24350b;
                guVar3.post(new fu(guVar3, 4));
                return;
            default:
                this.f24350b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
