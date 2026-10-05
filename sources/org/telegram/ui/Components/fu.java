package org.telegram.ui.Components;
public final class fu implements Runnable {
    public final int f26587a;
    public final gu f26588b;

    public fu(gu guVar, int i10) {
        this.f26587a = i10;
        this.f26588b = guVar;
    }

    @Override
    public final void run() {
        switch (this.f26587a) {
            case 0:
                gu guVar = this.f26588b;
                guVar.post(new fu(guVar, 1));
                return;
            case 1:
                gu guVar2 = this.f26588b;
                guVar2.invalidateSpoilers();
                guVar2.b();
                return;
            case 2:
                gu.a(this.f26588b);
                return;
            case 3:
                gu guVar3 = this.f26588b;
                guVar3.post(new fu(guVar3, 4));
                return;
            default:
                this.f26588b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
