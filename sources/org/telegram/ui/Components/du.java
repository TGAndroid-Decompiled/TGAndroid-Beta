package org.telegram.ui.Components;
public final class du implements Runnable {
    public final int f23731a;
    public final eu f23732b;

    public du(eu euVar, int i10) {
        this.f23731a = i10;
        this.f23732b = euVar;
    }

    @Override
    public final void run() {
        switch (this.f23731a) {
            case 0:
                eu euVar = this.f23732b;
                euVar.post(new du(euVar, 1));
                return;
            case 1:
                eu euVar2 = this.f23732b;
                euVar2.invalidateSpoilers();
                euVar2.b();
                return;
            case 2:
                eu.a(this.f23732b);
                return;
            case 3:
                eu euVar3 = this.f23732b;
                euVar3.post(new du(euVar3, 4));
                return;
            default:
                this.f23732b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
