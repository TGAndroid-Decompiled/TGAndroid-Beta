package org.telegram.ui;
public final class b51 implements Runnable {
    public final int f45589a;
    public final StickersActivity f45590b;

    public b51(StickersActivity stickersActivity, int i7) {
        this.f45589a = i7;
        this.f45590b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45589a) {
            case 0:
                this.f45590b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f45590b;
                stickersActivity.f43345n--;
                return;
        }
    }
}
