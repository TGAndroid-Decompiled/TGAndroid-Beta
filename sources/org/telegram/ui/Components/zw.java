package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33051a;
    public final hz f33052b;

    public zw(hz hzVar, int i10) {
        this.f33051a = i10;
        this.f33052b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33051a) {
            case 0:
            default:
                this.f33052b.e();
                return;
        }
    }
}
