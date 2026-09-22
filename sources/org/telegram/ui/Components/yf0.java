package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yf0 extends AnimatorListenerAdapter {
    public final int f30236a;
    public final PipRoundVideoView f30237b;

    public yf0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f30236a = i10;
        this.f30237b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30236a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f30237b;
                if (animator.equals(pipRoundVideoView.f22082r)) {
                    pipRoundVideoView.f22082r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f30237b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f22083s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
