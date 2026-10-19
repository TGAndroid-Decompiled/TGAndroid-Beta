package org.telegram.ui;
public final class q91 implements Runnable {
    public final int f40505a;
    public final StickersActivity f40506b;

    public q91(StickersActivity stickersActivity, int i10) {
        this.f40505a = i10;
        this.f40506b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f40505a) {
            case 0:
                this.f40506b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f40506b;
                stickersActivity.f33854r--;
                return;
        }
    }
}
