package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class t7 implements Runnable {
    public final int f43189a;
    public final q7 f43190b;

    public t7(q7 q7Var, int i7) {
        this.f43189a = i7;
        this.f43190b = q7Var;
    }

    @Override
    public final void run() {
        switch (this.f43189a) {
            case 0:
                this.f43190b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f43190b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
