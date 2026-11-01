package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class x7 implements Runnable {
    public final int f35397a;
    public final u7 f35398b;

    public x7(u7 u7Var, int i10) {
        this.f35397a = i10;
        this.f35398b = u7Var;
    }

    @Override
    public final void run() {
        switch (this.f35397a) {
            case 0:
                this.f35398b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f35398b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
