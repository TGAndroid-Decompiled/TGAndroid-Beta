package org.telegram.ui.Components;
public final class cu implements Runnable {
    public final int f23132a;
    public final du f23133b;

    public cu(du duVar, int i10) {
        this.f23132a = i10;
        this.f23133b = duVar;
    }

    @Override
    public final void run() {
        switch (this.f23132a) {
            case 0:
                du duVar = this.f23133b;
                duVar.post(new cu(duVar, 1));
                return;
            case 1:
                du duVar2 = this.f23133b;
                duVar2.invalidateSpoilers();
                duVar2.b();
                return;
            case 2:
                du.a(this.f23133b);
                return;
            case 3:
                du duVar3 = this.f23133b;
                duVar3.post(new cu(duVar3, 4));
                return;
            default:
                this.f23133b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
