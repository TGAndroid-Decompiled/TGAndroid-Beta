package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class j7 implements Runnable {
    public final int f34647a;
    public final g7 f34648b;

    public j7(g7 g7Var, int i10) {
        this.f34647a = i10;
        this.f34648b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f34647a) {
            case 0:
                this.f34648b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f34648b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
