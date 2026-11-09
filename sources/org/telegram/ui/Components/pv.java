package org.telegram.ui.Components;
public final class pv implements Runnable {
    public final int f37097a;
    public final vx f37098b;

    public pv(vx vxVar, int i7) {
        this.f37097a = i7;
        this.f37098b = vxVar;
    }

    @Override
    public final void run() {
        switch (this.f37097a) {
            case 0:
            default:
                this.f37098b.e();
                return;
        }
    }
}
