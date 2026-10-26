package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wg0 extends AnimatorListenerAdapter {
    public final int f34437a;
    public final PipRoundVideoView f34438b;

    public wg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f34437a = i10;
        this.f34438b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34437a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f34438b;
                if (animator.equals(pipRoundVideoView.f26201r)) {
                    pipRoundVideoView.f26201r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f34438b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f26202s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
