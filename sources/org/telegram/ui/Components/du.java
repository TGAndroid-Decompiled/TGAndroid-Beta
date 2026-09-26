package org.telegram.ui.Components;
public final class du implements Runnable {
    public final int f23730a;
    public final eu f23731b;

    public du(eu euVar, int i10) {
        this.f23730a = i10;
        this.f23731b = euVar;
    }

    @Override
    public final void run() {
        switch (this.f23730a) {
            case 0:
                eu euVar = this.f23731b;
                euVar.post(new du(euVar, 1));
                return;
            case 1:
                eu euVar2 = this.f23731b;
                euVar2.invalidateSpoilers();
                euVar2.b();
                return;
            case 2:
                eu.a(this.f23731b);
                return;
            case 3:
                eu euVar3 = this.f23731b;
                euVar3.post(new du(euVar3, 4));
                return;
            default:
                this.f23731b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
