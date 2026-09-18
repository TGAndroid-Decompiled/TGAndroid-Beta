package org.telegram.ui;
public final class ab1 implements Runnable {
    public final int f31997a;
    public final StickersActivity f31998b;

    public ab1(StickersActivity stickersActivity, int i10) {
        this.f31997a = i10;
        this.f31998b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f31997a) {
            case 0:
                this.f31998b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f31998b;
                stickersActivity.f31757r--;
                return;
        }
    }
}
