package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f33899a;
    public final PipRoundVideoView f33900b;

    public ge0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f33899a = i7;
        this.f33900b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33899a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f33900b;
                if (animator.equals(pipRoundVideoView.f31427r)) {
                    pipRoundVideoView.f31427r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f33900b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31428s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
