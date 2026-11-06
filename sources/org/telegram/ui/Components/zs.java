package org.telegram.ui.Components;
public final class zs implements Runnable {
    public final int f41116a;
    public final ct f41117b;

    public zs(ct ctVar, int i7) {
        this.f41116a = i7;
        this.f41117b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f41116a) {
            case 0:
                ct ctVar = this.f41117b;
                ctVar.post(new zs(ctVar, 1));
                return;
            default:
                ct ctVar2 = this.f41117b;
                ctVar2.h();
                ctVar2.d();
                return;
        }
    }
}
