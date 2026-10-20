package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class j7 implements Runnable {
    public final int f34387a;
    public final g7 f34388b;

    public j7(g7 g7Var, int i10) {
        this.f34387a = i10;
        this.f34388b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f34387a) {
            case 0:
                this.f34388b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f34388b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
