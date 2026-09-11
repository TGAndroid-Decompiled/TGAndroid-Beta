package org.telegram.ui.Components;
public final class au implements Runnable {
    public final int f24456a;
    public final bu f24457b;

    public au(bu buVar, int i10) {
        this.f24456a = i10;
        this.f24457b = buVar;
    }

    @Override
    public final void run() {
        switch (this.f24456a) {
            case 0:
                bu buVar = this.f24457b;
                buVar.post(new au(buVar, 1));
                return;
            case 1:
                bu buVar2 = this.f24457b;
                buVar2.invalidateSpoilers();
                buVar2.b();
                return;
            case 2:
                bu.a(this.f24457b);
                return;
            case 3:
                bu buVar3 = this.f24457b;
                buVar3.post(new au(buVar3, 4));
                return;
            default:
                this.f24457b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
