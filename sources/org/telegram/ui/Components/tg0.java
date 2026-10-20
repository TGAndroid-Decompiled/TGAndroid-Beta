package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30517a;
    public final PipRoundVideoView f30518b;

    public tg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30517a = i10;
        this.f30518b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30517a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30518b;
                if (animator.equals(pipRoundVideoView.f24264r)) {
                    pipRoundVideoView.f24264r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30518b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24265s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
