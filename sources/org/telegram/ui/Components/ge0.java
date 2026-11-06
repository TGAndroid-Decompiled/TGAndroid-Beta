package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f33951a;
    public final PipRoundVideoView f33952b;

    public ge0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f33951a = i7;
        this.f33952b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33951a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f33952b;
                if (animator.equals(pipRoundVideoView.f31427r)) {
                    pipRoundVideoView.f31427r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f33952b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31428s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
