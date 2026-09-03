package org.telegram.ui;
public final class oa1 implements Runnable {
    public final int f39633a;
    public final StickersActivity f39634b;

    public oa1(StickersActivity stickersActivity, int i10) {
        this.f39633a = i10;
        this.f39634b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f39633a) {
            case 0:
                this.f39634b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f39634b;
                stickersActivity.f34836r--;
                return;
        }
    }
}
