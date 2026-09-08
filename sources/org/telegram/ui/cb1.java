package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f35083a;
    public final StickersActivity f35084b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f35083a = i10;
        this.f35084b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f35083a) {
            case 0:
                this.f35084b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f35084b;
                stickersActivity.f34164r--;
                return;
        }
    }
}
