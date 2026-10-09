package org.telegram.ui.Components;
public final class su implements Runnable {
    public final int f30892a;
    public final tu f30893b;

    public su(tu tuVar, int i10) {
        this.f30892a = i10;
        this.f30893b = tuVar;
    }

    @Override
    public final void run() {
        switch (this.f30892a) {
            case 0:
                tu tuVar = this.f30893b;
                tuVar.post(new su(tuVar, 1));
                return;
            case 1:
                tu tuVar2 = this.f30893b;
                tuVar2.invalidateSpoilers();
                tuVar2.b();
                return;
            case 2:
                tu.a(this.f30893b);
                return;
            case 3:
                tu tuVar3 = this.f30893b;
                tuVar3.post(new su(tuVar3, 4));
                return;
            default:
                this.f30893b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
