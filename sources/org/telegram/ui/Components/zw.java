package org.telegram.ui.Components;
public final class zw implements Runnable {
    public final int f33050a;
    public final hz f33051b;

    public zw(hz hzVar, int i10) {
        this.f33050a = i10;
        this.f33051b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f33050a) {
            case 0:
            default:
                this.f33051b.e();
                return;
        }
    }
}
