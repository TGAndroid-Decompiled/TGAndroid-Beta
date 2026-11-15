package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class s7 implements Runnable {
    public final int f44488a;
    public final p7 f44489b;

    public s7(p7 p7Var, int i7) {
        this.f44488a = i7;
        this.f44489b = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f44488a) {
            case 0:
                this.f44489b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f44489b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
