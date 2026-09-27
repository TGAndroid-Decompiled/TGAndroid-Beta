package org.telegram.ui.Components;
public final class eu implements Runnable {
    public final int f24122a;
    public final fu f24123b;

    public eu(fu fuVar, int i10) {
        this.f24122a = i10;
        this.f24123b = fuVar;
    }

    @Override
    public final void run() {
        switch (this.f24122a) {
            case 0:
                fu fuVar = this.f24123b;
                fuVar.post(new eu(fuVar, 1));
                return;
            case 1:
                fu fuVar2 = this.f24123b;
                fuVar2.invalidateSpoilers();
                fuVar2.b();
                return;
            case 2:
                fu.a(this.f24123b);
                return;
            case 3:
                fu fuVar3 = this.f24123b;
                fuVar3.post(new eu(fuVar3, 4));
                return;
            default:
                this.f24123b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
