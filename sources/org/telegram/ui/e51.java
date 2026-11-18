package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f47066a;
    public final StickersActivity f47067b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f47066a = i7;
        this.f47067b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f47066a) {
            case 0:
                this.f47067b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f47067b;
                stickersActivity.f43791n--;
                return;
        }
    }
}
