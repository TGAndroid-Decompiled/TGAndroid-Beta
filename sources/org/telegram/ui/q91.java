package org.telegram.ui;
public final class q91 implements Runnable {
    public final int f40510a;
    public final StickersActivity f40511b;

    public q91(StickersActivity stickersActivity, int i10) {
        this.f40510a = i10;
        this.f40511b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f40510a) {
            case 0:
                this.f40511b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f40511b;
                stickersActivity.f33852r--;
                return;
        }
    }
}
