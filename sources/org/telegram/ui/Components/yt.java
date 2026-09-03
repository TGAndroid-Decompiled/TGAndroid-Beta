package org.telegram.ui.Components;
public final class yt implements Runnable {
    public final int f33603a;
    public final zt f33604b;

    public yt(zt ztVar, int i10) {
        this.f33603a = i10;
        this.f33604b = ztVar;
    }

    @Override
    public final void run() {
        switch (this.f33603a) {
            case 0:
                zt ztVar = this.f33604b;
                ztVar.post(new yt(ztVar, 1));
                return;
            case 1:
                zt ztVar2 = this.f33604b;
                ztVar2.invalidateSpoilers();
                ztVar2.b();
                return;
            case 2:
                zt.a(this.f33604b);
                return;
            case 3:
                zt ztVar3 = this.f33604b;
                ztVar3.post(new yt(ztVar3, 4));
                return;
            default:
                this.f33604b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
