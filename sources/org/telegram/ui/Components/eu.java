package org.telegram.ui.Components;
public final class eu implements Runnable {
    public final int f24052a;
    public final fu f24053b;

    public eu(fu fuVar, int i10) {
        this.f24052a = i10;
        this.f24053b = fuVar;
    }

    @Override
    public final void run() {
        switch (this.f24052a) {
            case 0:
                fu fuVar = this.f24053b;
                fuVar.post(new eu(fuVar, 1));
                return;
            case 1:
                fu fuVar2 = this.f24053b;
                fuVar2.invalidateSpoilers();
                fuVar2.b();
                return;
            case 2:
                fu.a(this.f24053b);
                return;
            case 3:
                fu fuVar3 = this.f24053b;
                fuVar3.post(new eu(fuVar3, 4));
                return;
            default:
                this.f24053b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
