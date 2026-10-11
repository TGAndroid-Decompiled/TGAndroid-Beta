package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f36363a;
    public final StickersActivity f36364b;

    public bb1(StickersActivity stickersActivity, int i10) {
        this.f36363a = i10;
        this.f36364b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f36363a) {
            case 0:
                this.f36364b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f36364b;
                stickersActivity.f34554r--;
                return;
        }
    }
}
