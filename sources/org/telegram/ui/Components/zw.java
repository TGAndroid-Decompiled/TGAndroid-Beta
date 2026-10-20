package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33046a;
    public final hz f33047b;

    public zw(hz hzVar, int i10) {
        this.f33046a = i10;
        this.f33047b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33046a) {
            case 0:
            default:
                this.f33047b.e();
                return;
        }
    }
}
