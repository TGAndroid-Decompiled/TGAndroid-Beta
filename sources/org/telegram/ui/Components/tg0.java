package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30518a;
    public final PipRoundVideoView f30519b;

    public tg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30518a = i10;
        this.f30519b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30518a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30519b;
                if (animator.equals(pipRoundVideoView.f24264r)) {
                    pipRoundVideoView.f24264r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30519b;
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
