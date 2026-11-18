package org.telegram.ui.Components;
public final class nt implements Runnable {
    public final int f37854a;
    public final pt f37855b;

    public nt(pt ptVar, int i7) {
        this.f37854a = i7;
        this.f37855b = ptVar;
    }

    @Override
    public final void run() {
        switch (this.f37854a) {
            case 0:
                pt ptVar = this.f37855b;
                ptVar.post(new nt(ptVar, 1));
                return;
            default:
                pt ptVar2 = this.f37855b;
                ptVar2.h();
                ptVar2.d();
                return;
        }
    }
}
