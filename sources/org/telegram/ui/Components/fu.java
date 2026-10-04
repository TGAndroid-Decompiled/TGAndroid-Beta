package org.telegram.ui.Components;
public final class fu implements Runnable {
    public final int f26565a;
    public final gu f26566b;

    public fu(gu guVar, int i10) {
        this.f26565a = i10;
        this.f26566b = guVar;
    }

    @Override
    public final void run() {
        switch (this.f26565a) {
            case 0:
                gu guVar = this.f26566b;
                guVar.post(new fu(guVar, 1));
                return;
            case 1:
                gu guVar2 = this.f26566b;
                guVar2.invalidateSpoilers();
                guVar2.b();
                return;
            case 2:
                gu.a(this.f26566b);
                return;
            case 3:
                gu guVar3 = this.f26566b;
                guVar3.post(new fu(guVar3, 4));
                return;
            default:
                this.f26566b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
