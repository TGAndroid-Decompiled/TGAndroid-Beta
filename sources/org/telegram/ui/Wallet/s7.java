package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class s7 implements Runnable {
    public final int f43137a;
    public final p7 f43138b;

    public s7(p7 p7Var, int i7) {
        this.f43137a = i7;
        this.f43138b = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f43137a) {
            case 0:
                this.f43138b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f43138b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
