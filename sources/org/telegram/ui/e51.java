package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f47108a;
    public final StickersActivity f47109b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f47108a = i7;
        this.f47109b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f47108a) {
            case 0:
                this.f47109b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f47109b;
                stickersActivity.f43801n--;
                return;
        }
    }
}
