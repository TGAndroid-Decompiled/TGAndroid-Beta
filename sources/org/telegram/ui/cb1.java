package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f36612a;
    public final StickersActivity f36613b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f36612a = i10;
        this.f36613b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f36612a) {
            case 0:
                this.f36613b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f36613b;
                stickersActivity.f34492r--;
                return;
        }
    }
}
