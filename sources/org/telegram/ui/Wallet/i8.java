package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class i8 implements Runnable {
    public final int f44405a;
    public final e8 f44406b;

    public i8(e8 e8Var, int i7) {
        this.f44405a = i7;
        this.f44406b = e8Var;
    }

    @Override
    public final void run() {
        switch (this.f44405a) {
            case 0:
                this.f44406b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f44406b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
