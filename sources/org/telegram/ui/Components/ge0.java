package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f33907a;
    public final PipRoundVideoView f33908b;

    public ge0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f33907a = i7;
        this.f33908b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33907a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f33908b;
                if (animator.equals(pipRoundVideoView.f31428r)) {
                    pipRoundVideoView.f31428r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f33908b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f31429s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
