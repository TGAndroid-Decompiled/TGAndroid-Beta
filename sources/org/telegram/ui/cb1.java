package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f36656a;
    public final StickersActivity f36657b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f36656a = i10;
        this.f36657b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f36656a) {
            case 0:
                this.f36657b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f36657b;
                stickersActivity.f34530r--;
                return;
        }
    }
}
