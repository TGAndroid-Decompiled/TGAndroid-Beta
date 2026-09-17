package org.telegram.ui;
public final class cb1 implements Runnable {
    public final int f35084a;
    public final StickersActivity f35085b;

    public cb1(StickersActivity stickersActivity, int i10) {
        this.f35084a = i10;
        this.f35085b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f35084a) {
            case 0:
                this.f35085b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f35085b;
                stickersActivity.f34165r--;
                return;
        }
    }
}
