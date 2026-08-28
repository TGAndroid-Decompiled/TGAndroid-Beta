package org.telegram.ui.Components;
public final class nt implements Runnable {
    public final int f31180a;
    public final ot f31181b;

    public nt(ot otVar, int i9) {
        this.f31180a = i9;
        this.f31181b = otVar;
    }

    @Override
    public final void run() {
        switch (this.f31180a) {
            case 0:
                ot otVar = this.f31181b;
                otVar.post(new nt(otVar, 1));
                return;
            case 1:
                ot otVar2 = this.f31181b;
                otVar2.invalidateSpoilers();
                otVar2.b();
                return;
            case 2:
                ot.a(this.f31181b);
                return;
            case 3:
                ot otVar3 = this.f31181b;
                otVar3.post(new nt(otVar3, 4));
                return;
            default:
                this.f31181b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
