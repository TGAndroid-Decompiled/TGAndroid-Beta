package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f47139a;
    public final StickersActivity f47140b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f47139a = i7;
        this.f47140b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f47139a) {
            case 0:
                this.f47140b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f47140b;
                stickersActivity.f43832n--;
                return;
        }
    }
}
