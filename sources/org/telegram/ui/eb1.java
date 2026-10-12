package org.telegram.ui;
public final class eb1 implements Runnable {
    public final int f37055a;
    public final StickersActivity f37056b;

    public eb1(StickersActivity stickersActivity, int i10) {
        this.f37055a = i10;
        this.f37056b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f37055a) {
            case 0:
                this.f37056b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f37056b;
                stickersActivity.f34329r--;
                return;
        }
    }
}
