package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f28469a;
    public final PipRoundVideoView f28470b;

    public lg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f28469a = i10;
        this.f28470b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28469a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f28470b;
                if (animator.equals(pipRoundVideoView.f24222r)) {
                    pipRoundVideoView.f24222r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f28470b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24223s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
