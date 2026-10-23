package org.telegram.ui;
public final class q91 implements Runnable {
    public final int f40515a;
    public final StickersActivity f40516b;

    public q91(StickersActivity stickersActivity, int i10) {
        this.f40515a = i10;
        this.f40516b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f40515a) {
            case 0:
                this.f40516b.m0();
                return;
            default:
                StickersActivity stickersActivity = this.f40516b;
                stickersActivity.f33865r--;
                return;
        }
    }
}
