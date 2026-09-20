package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f32702a;
    public final StickersActivity f32703b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f32702a = i10;
        this.f32703b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f32702a) {
            case 0:
                this.f32703b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f32703b;
                stickersActivity.f31797r--;
                return;
        }
    }
}
