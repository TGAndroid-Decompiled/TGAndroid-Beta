package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hf0 extends AnimatorListenerAdapter {
    public final int f29069a;
    public final PipRoundVideoView f29070b;

    public hf0(PipRoundVideoView pipRoundVideoView, int i9) {
        this.f29069a = i9;
        this.f29070b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29069a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f29070b;
                if (animator.equals(pipRoundVideoView.f26430r)) {
                    pipRoundVideoView.f26430r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f29070b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f26431s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
