package org.telegram.ui;
public final class eb1 implements Runnable {
    public final int f37059a;
    public final StickersActivity f37060b;

    public eb1(StickersActivity stickersActivity, int i10) {
        this.f37059a = i10;
        this.f37060b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f37059a) {
            case 0:
                this.f37060b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f37060b;
                stickersActivity.f34331r--;
                return;
        }
    }
}
