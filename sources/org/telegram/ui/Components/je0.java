package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je0 extends AnimatorListenerAdapter {
    public final int f35960a;
    public final PipRoundVideoView f35961b;

    public je0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f35960a = i7;
        this.f35961b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35960a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f35961b;
                if (animator.equals(pipRoundVideoView.f32610r)) {
                    pipRoundVideoView.f32610r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f35961b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f32611s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
