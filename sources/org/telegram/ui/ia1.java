package org.telegram.ui;
public final class ia1 implements Runnable {
    public final int f37788a;
    public final StickersActivity f37789b;

    public ia1(StickersActivity stickersActivity, int i10) {
        this.f37788a = i10;
        this.f37789b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f37788a) {
            case 0:
                this.f37789b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f37789b;
                stickersActivity.f34836r--;
                return;
        }
    }
}
