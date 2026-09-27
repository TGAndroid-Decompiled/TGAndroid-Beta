package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f26045a;
    public final PipRoundVideoView f26046b;

    public lg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f26045a = i10;
        this.f26046b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26045a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f26046b;
                if (animator.equals(pipRoundVideoView.f22310r)) {
                    pipRoundVideoView.f22310r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f26046b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22311s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
