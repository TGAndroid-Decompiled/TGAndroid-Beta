package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f33933a;
    public final PipRoundVideoView f33934b;

    public ge0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f33933a = i7;
        this.f33934b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33933a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f33934b;
                if (animator.equals(pipRoundVideoView.f31432r)) {
                    pipRoundVideoView.f31432r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f33934b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31433s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
