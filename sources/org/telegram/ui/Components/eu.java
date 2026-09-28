package org.telegram.ui.Components;
public final class eu implements Runnable {
    public final int f24063a;
    public final fu f24064b;

    public eu(fu fuVar, int i10) {
        this.f24063a = i10;
        this.f24064b = fuVar;
    }

    @Override
    public final void run() {
        switch (this.f24063a) {
            case 0:
                fu fuVar = this.f24064b;
                fuVar.post(new eu(fuVar, 1));
                return;
            case 1:
                fu fuVar2 = this.f24064b;
                fuVar2.invalidateSpoilers();
                fuVar2.b();
                return;
            case 2:
                fu.a(this.f24064b);
                return;
            case 3:
                fu fuVar3 = this.f24064b;
                fuVar3.post(new eu(fuVar3, 4));
                return;
            default:
                this.f24064b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
