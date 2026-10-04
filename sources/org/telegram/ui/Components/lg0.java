package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f28361a;
    public final PipRoundVideoView f28362b;

    public lg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f28361a = i10;
        this.f28362b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28361a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f28362b;
                if (animator.equals(pipRoundVideoView.f24215r)) {
                    pipRoundVideoView.f24215r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f28362b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24216s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
