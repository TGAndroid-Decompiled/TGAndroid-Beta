package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class i8 implements Runnable {
    public final int f44409a;
    public final e8 f44410b;

    public i8(e8 e8Var, int i7) {
        this.f44409a = i7;
        this.f44410b = e8Var;
    }

    @Override
    public final void run() {
        switch (this.f44409a) {
            case 0:
                this.f44410b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f44410b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
