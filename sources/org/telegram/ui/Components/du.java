package org.telegram.ui.Components;
public final class du implements Runnable {
    public final int f23462a;
    public final eu f23463b;

    public du(eu euVar, int i10) {
        this.f23462a = i10;
        this.f23463b = euVar;
    }

    @Override
    public final void run() {
        switch (this.f23462a) {
            case 0:
                eu euVar = this.f23463b;
                euVar.post(new du(euVar, 1));
                return;
            case 1:
                eu euVar2 = this.f23463b;
                euVar2.invalidateSpoilers();
                euVar2.b();
                return;
            case 2:
                eu.a(this.f23463b);
                return;
            case 3:
                eu euVar3 = this.f23463b;
                euVar3.post(new du(euVar3, 4));
                return;
            default:
                this.f23463b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
