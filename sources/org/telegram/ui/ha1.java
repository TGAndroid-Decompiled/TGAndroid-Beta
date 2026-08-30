package org.telegram.ui;
public final class ha1 implements Runnable {
    public final int f34805a;
    public final StickersActivity f34806b;

    public ha1(StickersActivity stickersActivity, int i10) {
        this.f34805a = i10;
        this.f34806b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f34805a) {
            case 0:
                this.f34806b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f34806b;
                stickersActivity.f32298r--;
                return;
        }
    }
}
