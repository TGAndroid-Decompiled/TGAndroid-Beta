package org.telegram.ui.Components;
public final class vt implements Runnable {
    public final int f30048a;
    public final wt f30049b;

    public vt(wt wtVar, int i10) {
        this.f30048a = i10;
        this.f30049b = wtVar;
    }

    @Override
    public final void run() {
        switch (this.f30048a) {
            case 0:
                wt wtVar = this.f30049b;
                wtVar.post(new vt(wtVar, 1));
                return;
            case 1:
                wt wtVar2 = this.f30049b;
                wtVar2.invalidateSpoilers();
                wtVar2.b();
                return;
            case 2:
                wt.a(this.f30049b);
                return;
            case 3:
                wt wtVar3 = this.f30049b;
                wtVar3.post(new vt(wtVar3, 4));
                return;
            default:
                this.f30049b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
