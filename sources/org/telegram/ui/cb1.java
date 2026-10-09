package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f36610a;
    public final StickersActivity f36611b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f36610a = i10;
        this.f36611b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f36610a) {
            case 0:
                this.f36611b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f36611b;
                stickersActivity.f34492r--;
                return;
        }
    }
}
