package org.telegram.ui.Components;
public final class zs implements Runnable {
    public final int f41096a;
    public final ct f41097b;

    public zs(ct ctVar, int i7) {
        this.f41096a = i7;
        this.f41097b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f41096a) {
            case 0:
                ct ctVar = this.f41097b;
                ctVar.post(new zs(ctVar, 1));
                return;
            default:
                ct ctVar2 = this.f41097b;
                ctVar2.h();
                ctVar2.d();
                return;
        }
    }
}
