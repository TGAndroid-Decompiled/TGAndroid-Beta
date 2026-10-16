package org.telegram.ui;
public final class ib1 implements Runnable {
    public final int f36770a;
    public final StickersActivity f36771b;

    public ib1(StickersActivity stickersActivity, int i10) {
        this.f36770a = i10;
        this.f36771b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f36770a) {
            case 0:
                this.f36771b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f36771b;
                stickersActivity.f32506r--;
                return;
        }
    }
}
