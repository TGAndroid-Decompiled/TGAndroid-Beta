package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f35056a;
    public final StickersActivity f35057b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f35056a = i10;
        this.f35057b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f35056a) {
            case 0:
                this.f35057b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f35057b;
                stickersActivity.f34137r--;
                return;
        }
    }
}
