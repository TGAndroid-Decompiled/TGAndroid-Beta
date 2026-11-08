package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;
public final class r7 implements Runnable {
    public final int f43100a;
    public final o7 f43101b;

    public r7(o7 o7Var, int i7) {
        this.f43100a = i7;
        this.f43101b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f43100a) {
            case 0:
                this.f43101b.animate().rotation(0.0f).setDuration(120L).start();
                return;
            default:
                this.f43101b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                return;
        }
    }
}
