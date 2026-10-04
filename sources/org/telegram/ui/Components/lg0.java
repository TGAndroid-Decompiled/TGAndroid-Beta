package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f28360a;
    public final PipRoundVideoView f28361b;

    public lg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f28360a = i10;
        this.f28361b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28360a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f28361b;
                if (animator.equals(pipRoundVideoView.f24214r)) {
                    pipRoundVideoView.f24214r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f28361b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24215s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
