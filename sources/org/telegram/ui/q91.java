package org.telegram.ui;
public final class q91 implements Runnable {
    public final int f40514a;
    public final StickersActivity f40515b;

    public q91(StickersActivity stickersActivity, int i10) {
        this.f40514a = i10;
        this.f40515b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f40514a) {
            case 0:
                this.f40515b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f40515b;
                stickersActivity.f33864r--;
                return;
        }
    }
}
