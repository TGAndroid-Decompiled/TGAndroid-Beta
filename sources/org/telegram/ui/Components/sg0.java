package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sg0 extends AnimatorListenerAdapter {
    public final int f30260a;
    public final PipRoundVideoView f30261b;

    public sg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30260a = i10;
        this.f30261b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30260a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30261b;
                if (animator.equals(pipRoundVideoView.f24263r)) {
                    pipRoundVideoView.f24263r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30261b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24264s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
