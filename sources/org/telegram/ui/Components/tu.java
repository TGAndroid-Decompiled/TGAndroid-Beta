package org.telegram.ui.Components;
public final class tu implements Runnable {
    public final int f31152a;
    public final uu f31153b;

    public tu(uu uuVar, int i10) {
        this.f31152a = i10;
        this.f31153b = uuVar;
    }

    @Override
    public final void run() {
        switch (this.f31152a) {
            case 0:
                uu uuVar = this.f31153b;
                uuVar.post(new tu(uuVar, 1));
                return;
            case 1:
                uu uuVar2 = this.f31153b;
                uuVar2.invalidateSpoilers();
                uuVar2.b();
                return;
            case 2:
                uu.a(this.f31153b);
                return;
            case 3:
                uu uuVar3 = this.f31153b;
                uuVar3.post(new tu(uuVar3, 4));
                return;
            default:
                this.f31153b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
