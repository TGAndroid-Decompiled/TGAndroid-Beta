package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33043a;
    public final hz f33044b;

    public zw(hz hzVar, int i10) {
        this.f33043a = i10;
        this.f33044b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33043a) {
            case 0:
            default:
                this.f33044b.e();
                return;
        }
    }
}
