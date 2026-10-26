package org.telegram.ui.Components;
public final class ku implements Runnable {
    public final int f29983a;
    public final lu f29984b;

    public ku(lu luVar, int i10) {
        this.f29983a = i10;
        this.f29984b = luVar;
    }

    @Override
    public final void run() {
        switch (this.f29983a) {
            case 0:
                lu luVar = this.f29984b;
                luVar.post(new ku(luVar, 1));
                return;
            case 1:
                lu luVar2 = this.f29984b;
                luVar2.invalidateSpoilers();
                luVar2.b();
                return;
            case 2:
                lu.a(this.f29984b);
                return;
            case 3:
                lu luVar3 = this.f29984b;
                luVar3.post(new ku(luVar3, 4));
                return;
            default:
                this.f29984b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
