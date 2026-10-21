package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33047a;
    public final hz f33048b;

    public zw(hz hzVar, int i10) {
        this.f33047a = i10;
        this.f33048b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33047a) {
            case 0:
            default:
                this.f33048b.e();
                return;
        }
    }
}
