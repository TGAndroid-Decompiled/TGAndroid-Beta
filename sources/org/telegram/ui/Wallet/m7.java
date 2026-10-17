package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class m7 implements Runnable {
    public final int f34599a;
    public final j7 f34600b;

    public m7(j7 j7Var, int i10) {
        this.f34599a = i10;
        this.f34600b = j7Var;
    }

    @Override
    public final void run() {
        switch (this.f34599a) {
            case 0:
                this.f34600b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f34600b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
