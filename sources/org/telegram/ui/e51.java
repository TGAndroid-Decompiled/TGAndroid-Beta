package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f47143a;
    public final StickersActivity f47144b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f47143a = i7;
        this.f47144b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f47143a) {
            case 0:
                this.f47144b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f47144b;
                stickersActivity.f43791n--;
                return;
        }
    }
}
