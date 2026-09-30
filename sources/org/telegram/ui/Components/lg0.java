package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lg0 extends AnimatorListenerAdapter {
    public final int f25989a;
    public final PipRoundVideoView f25990b;

    public lg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25989a = i10;
        this.f25990b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25989a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25990b;
                if (animator.equals(pipRoundVideoView.f22329r)) {
                    pipRoundVideoView.f22329r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25990b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22330s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
