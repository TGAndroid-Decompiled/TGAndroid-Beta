package org.telegram.ui.Components;
public final class au implements Runnable {
    public final int f24483a;
    public final bu f24484b;

    public au(bu buVar, int i10) {
        this.f24483a = i10;
        this.f24484b = buVar;
    }

    @Override
    public final void run() {
        switch (this.f24483a) {
            case 0:
                bu buVar = this.f24484b;
                buVar.post(new au(buVar, 1));
                return;
            case 1:
                bu buVar2 = this.f24484b;
                buVar2.invalidateSpoilers();
                buVar2.b();
                return;
            case 2:
                bu.a(this.f24484b);
                return;
            case 3:
                bu buVar3 = this.f24484b;
                buVar3.post(new au(buVar3, 4));
                return;
            default:
                this.f24484b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
