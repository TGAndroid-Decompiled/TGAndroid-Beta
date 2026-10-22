package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30521a;
    public final PipRoundVideoView f30522b;

    public tg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30521a = i10;
        this.f30522b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30521a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30522b;
                if (animator.equals(pipRoundVideoView.f24267r)) {
                    pipRoundVideoView.f24267r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30522b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24268s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
