package org.telegram.ui;
public final class ab1 implements Runnable {
    public final int f31726a;
    public final StickersActivity f31727b;

    public ab1(StickersActivity stickersActivity, int i10) {
        this.f31726a = i10;
        this.f31727b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f31726a) {
            case 0:
                this.f31727b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f31727b;
                stickersActivity.f31510r--;
                return;
        }
    }
}
