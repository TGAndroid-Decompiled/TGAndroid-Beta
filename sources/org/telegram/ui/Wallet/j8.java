package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class j8 implements Runnable {
    public final int f44537a;
    public final f8 f44538b;

    public j8(f8 f8Var, int i7) {
        this.f44537a = i7;
        this.f44538b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f44537a) {
            case 0:
                this.f44538b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f44538b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
