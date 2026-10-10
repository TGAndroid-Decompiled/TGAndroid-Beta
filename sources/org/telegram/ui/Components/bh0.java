package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bh0 extends AnimatorListenerAdapter {
    public final int f24967a;
    public final PipRoundVideoView f24968b;

    public bh0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24967a = i10;
        this.f24968b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24967a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24968b;
                if (animator.equals(pipRoundVideoView.f24222r)) {
                    pipRoundVideoView.f24222r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24968b;
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
