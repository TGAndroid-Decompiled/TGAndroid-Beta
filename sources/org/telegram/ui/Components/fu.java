package org.telegram.ui.Components;
public final class fu implements Runnable {
    public final int f26564a;
    public final gu f26565b;

    public fu(gu guVar, int i10) {
        this.f26564a = i10;
        this.f26565b = guVar;
    }

    @Override
    public final void run() {
        switch (this.f26564a) {
            case 0:
                gu guVar = this.f26565b;
                guVar.post(new fu(guVar, 1));
                return;
            case 1:
                gu guVar2 = this.f26565b;
                guVar2.invalidateSpoilers();
                guVar2.b();
                return;
            case 2:
                gu.a(this.f26565b);
                return;
            case 3:
                gu guVar3 = this.f26565b;
                guVar3.post(new fu(guVar3, 4));
                return;
            default:
                this.f26565b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
