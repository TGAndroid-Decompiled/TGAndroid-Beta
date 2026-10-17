package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33036a;
    public final hz f33037b;

    public zw(hz hzVar, int i10) {
        this.f33036a = i10;
        this.f33037b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33036a) {
            case 0:
            default:
                this.f33037b.e();
                return;
        }
    }
}
