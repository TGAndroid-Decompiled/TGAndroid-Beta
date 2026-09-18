package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f32097a;
    public final StickersActivity f32098b;

    public bb1(StickersActivity stickersActivity, int i10) {
        this.f32097a = i10;
        this.f32098b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f32097a) {
            case 0:
                this.f32098b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f32098b;
                stickersActivity.f31530r--;
                return;
        }
    }
}
