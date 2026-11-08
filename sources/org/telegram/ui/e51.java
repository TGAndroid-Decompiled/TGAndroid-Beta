package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f45197a;
    public final StickersActivity f45198b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f45197a = i7;
        this.f45198b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45197a) {
            case 0:
                this.f45198b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f45198b;
                stickersActivity.f41973n--;
                return;
        }
    }
}
