package org.telegram.ui.Components;
public final class gu implements Runnable {
    public final int f23435a;
    public final hu f23436b;

    public gu(hu huVar, int i10) {
        this.f23435a = i10;
        this.f23436b = huVar;
    }

    @Override
    public final void run() {
        switch (this.f23435a) {
            case 0:
                hu huVar = this.f23436b;
                huVar.post(new gu(huVar, 1));
                return;
            case 1:
                hu huVar2 = this.f23436b;
                huVar2.invalidateSpoilers();
                huVar2.b();
                return;
            case 2:
                hu.a(this.f23436b);
                return;
            case 3:
                hu huVar3 = this.f23436b;
                huVar3.post(new gu(huVar3, 4));
                return;
            default:
                this.f23436b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
