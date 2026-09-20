package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hg0 extends AnimatorListenerAdapter {
    public final int f24661a;
    public final PipRoundVideoView f24662b;

    public hg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24661a = i10;
        this.f24662b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24661a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24662b;
                if (animator.equals(pipRoundVideoView.f22306r)) {
                    pipRoundVideoView.f22306r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24662b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22307s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
