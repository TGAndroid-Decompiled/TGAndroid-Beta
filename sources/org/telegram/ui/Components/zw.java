package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33343a;
    public final hz f33344b;

    public zw(hz hzVar, int i10) {
        this.f33343a = i10;
        this.f33344b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33343a) {
            case 0:
            default:
                this.f33344b.e();
                return;
        }
    }
}
