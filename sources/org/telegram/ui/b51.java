package org.telegram.ui;
public final class b51 implements Runnable {
    public final int f45595a;
    public final StickersActivity f45596b;

    public b51(StickersActivity stickersActivity, int i7) {
        this.f45595a = i7;
        this.f45596b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45595a) {
            case 0:
                this.f45596b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f45596b;
                stickersActivity.f43345n--;
                return;
        }
    }
}
