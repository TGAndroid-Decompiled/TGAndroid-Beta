package org.telegram.ui;
public final class bb1 implements Runnable {
    public final int f32093a;
    public final StickersActivity f32094b;

    public bb1(StickersActivity stickersActivity, int i10) {
        this.f32093a = i10;
        this.f32094b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f32093a) {
            case 0:
                this.f32094b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f32094b;
                stickersActivity.f31526r--;
                return;
        }
    }
}
