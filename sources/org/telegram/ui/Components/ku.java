package org.telegram.ui.Components;
public final class ku implements Runnable {
    public final int f30030a;
    public final lu f30031b;

    public ku(lu luVar, int i10) {
        this.f30030a = i10;
        this.f30031b = luVar;
    }

    @Override
    public final void run() {
        switch (this.f30030a) {
            case 0:
                lu luVar = this.f30031b;
                luVar.post(new ku(luVar, 1));
                return;
            case 1:
                lu luVar2 = this.f30031b;
                luVar2.invalidateSpoilers();
                luVar2.b();
                return;
            case 2:
                lu.a(this.f30031b);
                return;
            case 3:
                lu luVar3 = this.f30031b;
                luVar3.post(new ku(luVar3, 4));
                return;
            default:
                this.f30031b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
