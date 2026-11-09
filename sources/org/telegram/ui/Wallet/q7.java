package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class q7 implements Runnable {
    public final int f43018a;
    public final n7 f43019b;

    public q7(n7 n7Var, int i7) {
        this.f43018a = i7;
        this.f43019b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f43018a) {
            case 0:
                this.f43019b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f43019b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
