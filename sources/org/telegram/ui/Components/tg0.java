package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30522a;
    public final PipRoundVideoView f30523b;

    public tg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30522a = i10;
        this.f30523b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30522a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30523b;
                if (animator.equals(pipRoundVideoView.f24268r)) {
                    pipRoundVideoView.f24268r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30523b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24269s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
