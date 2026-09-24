package org.telegram.ui.Components;
public final class du implements Runnable {
    public final int f23711a;
    public final eu f23712b;

    public du(eu euVar, int i10) {
        this.f23711a = i10;
        this.f23712b = euVar;
    }

    @Override
    public final void run() {
        switch (this.f23711a) {
            case 0:
                eu euVar = this.f23712b;
                euVar.post(new du(euVar, 1));
                return;
            case 1:
                eu euVar2 = this.f23712b;
                euVar2.invalidateSpoilers();
                euVar2.b();
                return;
            case 2:
                eu.a(this.f23712b);
                return;
            case 3:
                eu euVar3 = this.f23712b;
                euVar3.post(new du(euVar3, 4));
                return;
            default:
                this.f23712b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
