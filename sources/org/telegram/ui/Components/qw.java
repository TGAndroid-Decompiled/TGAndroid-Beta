package org.telegram.ui.Components;
public final class qw implements Runnable {
    public final int f30514a;
    public final zy f30515b;

    public qw(zy zyVar, int i10) {
        this.f30514a = i10;
        this.f30515b = zyVar;
    }

    @Override
    public final void run() {
        switch (this.f30514a) {
            case 0:
            default:
                this.f30515b.d();
                return;
        }
    }
}
