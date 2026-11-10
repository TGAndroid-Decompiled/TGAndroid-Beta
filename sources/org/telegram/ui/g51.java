package org.telegram.ui;
public final class g51 implements Runnable {
    public final int f45989a;
    public final StickersActivity f45990b;

    public g51(StickersActivity stickersActivity, int i7) {
        this.f45989a = i7;
        this.f45990b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45989a) {
            case 0:
                this.f45990b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f45990b;
                stickersActivity.f41971n--;
                return;
        }
    }
}
