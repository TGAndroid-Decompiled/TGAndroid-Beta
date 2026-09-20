package org.telegram.ui.Components;
public final class cu implements Runnable {
    public final int f23400a;
    public final du f23401b;

    public cu(du duVar, int i10) {
        this.f23400a = i10;
        this.f23401b = duVar;
    }

    @Override
    public final void run() {
        switch (this.f23400a) {
            case 0:
                du duVar = this.f23401b;
                duVar.post(new cu(duVar, 1));
                return;
            case 1:
                du duVar2 = this.f23401b;
                duVar2.invalidateSpoilers();
                duVar2.b();
                return;
            case 2:
                du.a(this.f23401b);
                return;
            case 3:
                du duVar3 = this.f23401b;
                duVar3.post(new cu(duVar3, 4));
                return;
            default:
                this.f23401b.setSpoilersRevealed(false, true);
                return;
        }
    }
}
