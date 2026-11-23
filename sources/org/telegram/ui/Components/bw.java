package org.telegram.ui.Components;
public final class bw implements Runnable {
    public final int f33895a;
    public final hy f33896b;

    public bw(hy hyVar, int i7) {
        this.f33895a = i7;
        this.f33896b = hyVar;
    }

    @Override
    public final void run() {
        switch (this.f33895a) {
            case 0:
            default:
                this.f33896b.e();
                return;
        }
    }
}
