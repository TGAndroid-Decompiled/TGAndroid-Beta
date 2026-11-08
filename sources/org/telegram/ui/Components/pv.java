package org.telegram.ui.Components;
public final class pv implements Runnable {
    public final int f37107a;
    public final vx f37108b;

    public pv(vx vxVar, int i7) {
        this.f37107a = i7;
        this.f37108b = vxVar;
    }

    @Override
    public final void run() {
        switch (this.f37107a) {
            case 0:
            default:
                this.f37108b.e();
                return;
        }
    }
}
