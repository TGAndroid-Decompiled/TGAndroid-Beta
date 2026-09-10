package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f23627a;
    public final PipRoundVideoView f23628b;

    public hg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f23627a = i10;
        this.f23628b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23627a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f23628b;
                if (animator.equals(pipRoundVideoView.f21170r)) {
                    pipRoundVideoView.f21170r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f23628b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f21171s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
