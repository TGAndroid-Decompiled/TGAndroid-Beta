package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class p7 implements Runnable {
    public final int f34745a;
    public final m7 f34746b;

    public p7(m7 m7Var, int i10) {
        this.f34745a = i10;
        this.f34746b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f34745a) {
            case 0:
                this.f34746b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f34746b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
