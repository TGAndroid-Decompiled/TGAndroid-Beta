package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class j7 implements Runnable {
    public final int f34391a;
    public final g7 f34392b;

    public j7(g7 g7Var, int i10) {
        this.f34391a = i10;
        this.f34392b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f34391a) {
            case 0:
                this.f34392b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f34392b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
