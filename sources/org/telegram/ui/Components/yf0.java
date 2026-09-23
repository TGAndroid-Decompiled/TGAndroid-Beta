package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f30237a;
    public final PipRoundVideoView f30238b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30237a = i10;
        this.f30238b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30237a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30238b;
                if (animator.equals(pipRoundVideoView.f22056r)) {
                    pipRoundVideoView.f22056r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30238b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22057s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
