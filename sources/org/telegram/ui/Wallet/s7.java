package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class s7 implements Runnable {
    public final int f43113a;
    public final p7 f43114b;

    public s7(p7 p7Var, int i7) {
        this.f43113a = i7;
        this.f43114b = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f43113a) {
            case 0:
                this.f43114b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f43114b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
