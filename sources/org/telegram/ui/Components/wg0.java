package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wg0 extends AnimatorListenerAdapter {
    public final int f34434a;
    public final PipRoundVideoView f34435b;

    public wg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f34434a = i10;
        this.f34435b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34434a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f34435b;
                if (animator.equals(pipRoundVideoView.f26199r)) {
                    pipRoundVideoView.f26199r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f34435b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f26200s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
