package org.telegram.ui.Components;
public final class zs implements Runnable {
    public final int f41102a;
    public final ct f41103b;

    public zs(ct ctVar, int i7) {
        this.f41102a = i7;
        this.f41103b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f41102a) {
            case 0:
                ct ctVar = this.f41103b;
                ctVar.post(new zs(ctVar, 1));
                return;
            default:
                ct ctVar2 = this.f41103b;
                ctVar2.h();
                ctVar2.d();
                return;
        }
    }
}
