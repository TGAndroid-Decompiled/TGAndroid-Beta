package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xg0 extends AnimatorListenerAdapter {
    public final int f34762a;
    public final PipRoundVideoView f34763b;

    public xg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f34762a = i10;
        this.f34763b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34762a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f34763b;
                if (animator.equals(pipRoundVideoView.f26203r)) {
                    pipRoundVideoView.f26203r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f34763b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f26204s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
