package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class x7 implements Runnable {
    public final int f35391a;
    public final u7 f35392b;

    public x7(u7 u7Var, int i10) {
        this.f35391a = i10;
        this.f35392b = u7Var;
    }

    @Override
    public final void run() {
        switch (this.f35391a) {
            case 0:
                this.f35392b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f35392b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
