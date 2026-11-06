package org.telegram.ui.Components;
public final class zs implements Runnable {
    public final int f41071a;
    public final ct f41072b;

    public zs(ct ctVar, int i7) {
        this.f41071a = i7;
        this.f41072b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f41071a) {
            case 0:
                ct ctVar = this.f41072b;
                ctVar.post(new zs(ctVar, 1));
                return;
            default:
                ct ctVar2 = this.f41072b;
                ctVar2.h();
                ctVar2.d();
                return;
        }
    }
}
