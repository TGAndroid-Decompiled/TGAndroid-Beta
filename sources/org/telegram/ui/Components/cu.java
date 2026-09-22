package org.telegram.ui.Components;
public final class cu implements Runnable {
    public final int f23442a;
    public final du f23443b;

    public cu(du duVar, int i10) {
        this.f23442a = i10;
        this.f23443b = duVar;
    }

    @Override
    public final void run() {
        switch (this.f23442a) {
            case 0:
                du duVar = this.f23443b;
                duVar.post(new cu(duVar, 1));
                return;
            case 1:
                du duVar2 = this.f23443b;
                duVar2.invalidateSpoilers();
                duVar2.b();
                return;
            case 2:
                du.a(this.f23443b);
                return;
            case 3:
                du duVar3 = this.f23443b;
                duVar3.post(new cu(duVar3, 4));
                return;
            default:
                this.f23443b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
