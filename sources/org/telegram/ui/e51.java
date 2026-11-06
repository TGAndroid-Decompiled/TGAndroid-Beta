package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f45173a;
    public final StickersActivity f45174b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f45173a = i7;
        this.f45174b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45173a) {
            case 0:
                this.f45174b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f45174b;
                stickersActivity.f41945n--;
                return;
        }
    }
}
