package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uf0 extends AnimatorListenerAdapter {
    public final int f33220a;
    public final PipRoundVideoView f33221b;

    public uf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f33220a = i10;
        this.f33221b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33220a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f33221b;
                if (animator.equals(pipRoundVideoView.f26441r)) {
                    pipRoundVideoView.f26441r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f33221b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f26442s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
