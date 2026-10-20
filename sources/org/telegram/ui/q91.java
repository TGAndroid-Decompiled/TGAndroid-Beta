package org.telegram.ui;
public final class q91 implements Runnable {
    public final int f40511a;
    public final StickersActivity f40512b;

    public q91(StickersActivity stickersActivity, int i10) {
        this.f40511a = i10;
        this.f40512b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f40511a) {
            case 0:
                this.f40512b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f40512b;
                stickersActivity.f33860r--;
                return;
        }
    }
}
