package org.telegram.ui;
public final class d51 implements Runnable {
    public final int f46952a;
    public final StickersActivity f46953b;

    public d51(StickersActivity stickersActivity, int i7) {
        this.f46952a = i7;
        this.f46953b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f46952a) {
            case 0:
                this.f46953b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f46953b;
                stickersActivity.f43917n--;
                return;
        }
    }
}
