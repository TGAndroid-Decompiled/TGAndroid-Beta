package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f30239a;
    public final PipRoundVideoView f30240b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30239a = i10;
        this.f30240b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30239a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30240b;
                if (animator.equals(pipRoundVideoView.f22085r)) {
                    pipRoundVideoView.f22085r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30240b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22086s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
