package org.telegram.ui;
public final class e51 implements Runnable {
    public final int f45203a;
    public final StickersActivity f45204b;

    public e51(StickersActivity stickersActivity, int i7) {
        this.f45203a = i7;
        this.f45204b = stickersActivity;
    }

    @Override
    public final void run() {
        switch (this.f45203a) {
            case 0:
                this.f45204b.r0();
                return;
            default:
                StickersActivity stickersActivity = this.f45204b;
                stickersActivity.f41970n--;
                return;
        }
    }
}
