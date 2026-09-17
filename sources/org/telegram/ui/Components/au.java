package org.telegram.ui.Components;
public final class au implements Runnable {
    public final int f24457a;
    public final bu f24458b;

    public au(bu buVar, int i10) {
        this.f24457a = i10;
        this.f24458b = buVar;
    }

    @Override
    public final void run() {
        switch (this.f24457a) {
            case 0:
                bu buVar = this.f24458b;
                buVar.post(new au(buVar, 1));
                return;
            case 1:
                bu buVar2 = this.f24458b;
                buVar2.invalidateSpoilers();
                buVar2.b();
                return;
            case 2:
                bu.a(this.f24458b);
                return;
            case 3:
                bu buVar3 = this.f24458b;
                buVar3.post(new au(buVar3, 4));
                return;
            default:
                this.f24458b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
