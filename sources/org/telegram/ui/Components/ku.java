package org.telegram.ui.Components;
public final class ku implements Runnable {
    public final int f29981a;
    public final lu f29982b;

    public ku(lu luVar, int i10) {
        this.f29981a = i10;
        this.f29982b = luVar;
    }

    @Override
    public final void run() {
        switch (this.f29981a) {
            case 0:
                lu luVar = this.f29982b;
                luVar.post(new ku(luVar, 1));
                return;
            case 1:
                lu luVar2 = this.f29982b;
                luVar2.invalidateSpoilers();
                luVar2.b();
                return;
            case 2:
                lu.a(this.f29982b);
                return;
            case 3:
                lu luVar3 = this.f29982b;
                luVar3.post(new ku(luVar3, 4));
                return;
            default:
                this.f29982b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
