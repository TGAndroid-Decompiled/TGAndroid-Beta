package org.telegram.ui;
public final class ib1 implements Runnable {
    public final int f37083a;
    public final StickersActivity f37084b;

    public ib1(StickersActivity stickersActivity, int i10) {
        this.f37083a = i10;
        this.f37084b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f37083a) {
            case 0:
                this.f37084b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f37084b;
                stickersActivity.f32804r--;
                return;
        }
    }
}
