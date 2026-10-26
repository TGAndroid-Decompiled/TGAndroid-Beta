package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class j7 implements Runnable {
    public final int f36738a;
    public final g7 f36739b;

    public j7(g7 g7Var, int i10) {
        this.f36738a = i10;
        this.f36739b = g7Var;
    }

    @Override
    public final void run() {
        switch (this.f36738a) {
            case 0:
                this.f36739b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f36739b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
