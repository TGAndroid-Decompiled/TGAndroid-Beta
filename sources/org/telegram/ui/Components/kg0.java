package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg0 extends AnimatorListenerAdapter {
    public final int f25697a;
    public final PipRoundVideoView f25698b;

    public kg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25697a = i10;
        this.f25698b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25697a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25698b;
                if (animator.equals(pipRoundVideoView.f22309r)) {
                    pipRoundVideoView.f22309r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25698b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22310s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
