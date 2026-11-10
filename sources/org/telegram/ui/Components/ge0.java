package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f33881a;
    public final PipRoundVideoView f33882b;

    public ge0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f33881a = i7;
        this.f33882b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33881a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f33882b;
                if (animator.equals(pipRoundVideoView.f31448r)) {
                    pipRoundVideoView.f31448r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f33882b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31449s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
