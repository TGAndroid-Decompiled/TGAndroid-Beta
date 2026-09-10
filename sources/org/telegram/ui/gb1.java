package org.telegram.ui;
public final class gb1 implements Runnable {
    public final int f33053a;
    public final StickersActivity f33054b;

    public gb1(StickersActivity stickersActivity, int i10) {
        this.f33053a = i10;
        this.f33054b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f33053a) {
            case 0:
                this.f33054b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f33054b;
                stickersActivity.f30625r--;
                return;
        }
    }
}
