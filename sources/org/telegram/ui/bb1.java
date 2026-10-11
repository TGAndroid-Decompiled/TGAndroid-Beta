package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f36329a;
    public final StickersActivity f36330b;

    public bb1(StickersActivity stickersActivity, int i10) {
        this.f36329a = i10;
        this.f36330b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f36329a) {
            case 0:
                this.f36330b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f36330b;
                stickersActivity.f34520r--;
                return;
        }
    }
}
