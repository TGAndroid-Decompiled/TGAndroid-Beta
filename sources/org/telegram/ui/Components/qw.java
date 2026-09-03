package org.telegram.ui.Components;
public final class qw implements Runnable {
    public final int f30545a;
    public final zy f30546b;

    public qw(zy zyVar, int i10) {
        this.f30545a = i10;
        this.f30546b = zyVar;
    }

    @Override
    public final void run() {
        switch (this.f30545a) {
            case 0:
            default:
                this.f30546b.d();
                return;
        }
    }
}
