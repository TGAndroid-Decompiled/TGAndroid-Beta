package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f32722a;
    public final StickersActivity f32723b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f32722a = i10;
        this.f32723b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f32722a) {
            case 0:
                this.f32723b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f32723b;
                stickersActivity.f31818r--;
                return;
        }
    }
}
