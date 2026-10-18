package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class j7 implements Runnable {
    public final int f34364a;
    public final g7 f34365b;

    public j7(g7 g7Var, int i10) {
        this.f34364a = i10;
        this.f34365b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f34364a) {
            case 0:
                this.f34365b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f34365b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
