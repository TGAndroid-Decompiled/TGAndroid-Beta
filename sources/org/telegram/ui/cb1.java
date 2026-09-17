package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f35057a;
    public final StickersActivity f35058b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f35057a = i10;
        this.f35058b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f35057a) {
            case 0:
                this.f35058b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f35058b;
                stickersActivity.f34138r--;
                return;
        }
    }
}
