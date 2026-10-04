package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f28366a;
    public final PipRoundVideoView f28367b;

    public lg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f28366a = i10;
        this.f28367b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28366a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f28367b;
                if (animator.equals(pipRoundVideoView.f24219r)) {
                    pipRoundVideoView.f24219r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f28367b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24220s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
