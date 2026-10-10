package org.telegram.ui.Components;
public final class tu implements Runnable {
    public final int f31218a;
    public final uu f31219b;

    public tu(uu uuVar, int i10) {
        this.f31218a = i10;
        this.f31219b = uuVar;
    }

    @Override
    public final void run() {
        switch (this.f31218a) {
            case 0:
                uu uuVar = this.f31219b;
                uuVar.post(new tu(uuVar, 1));
                return;
            case 1:
                uu uuVar2 = this.f31219b;
                uuVar2.invalidateSpoilers();
                uuVar2.b();
                return;
            case 2:
                uu.a(this.f31219b);
                return;
            case 3:
                uu uuVar3 = this.f31219b;
                uuVar3.post(new tu(uuVar3, 4));
                return;
            default:
                this.f31219b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
